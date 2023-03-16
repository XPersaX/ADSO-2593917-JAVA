import java.util.Scanner;
import java.io.IOException;

public class Ejercicio2{
    //VARIABLE DE
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        //DEFINIENDO MAPA DEL LABERINTO
        int matriz [] []={
                          {1,1,1,1,1,1,1},
                          {1,0,0,0,1,0,3},
                          {1,0,1,0,1,0,1},
                          {1,0,1,0,1,0,1},
                          {2,0,1,0,0,0,1},
                          {1,1,1,1,1,1,1},
                         };
        //Ciclo del juego
        boolean jugando=true;
        int pos_f=4;
        int pos_c=0;

        while(jugando){
            //imprimir laverinto
            //IMPRIMIR EL LABERINTO
            //Matriz.length=sacar las filas de la primer dimension
            //Matriz[0].length=sacar las Columnas de la segunda dimension
            try { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} catch (Exception e) {}
            for (int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }

            //Imprimir el menu
            System.out.println("INGRESE HACIA DONDE DESEA MOVER LA FICHA");
            System.out.println("1. Arriba  2. Abajo  3. Derecha  4. Izquierda ");
            int opcion=entrada.nextInt();

            //Condiciones segun la sellecion del usuario
            //Codigo para mover Ariba
            if(opcion==1){
                //Preguntar si el movimiento es valido
                if(matriz[pos_f-1][pos_c]==0){
                   matriz[pos_f-1][pos_c]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f=pos_f-1;
                   pos_c=pos_c;
                }else if(matriz[pos_f-1][pos_c]==3){
                    jugando=false;
                }            
            }
            //Codigo para mover Abajo
            if(opcion==2){
                if(matriz[pos_f+1][pos_c]==0){
                   matriz[pos_f+1][pos_c]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f=pos_f+1;
                   pos_c=pos_c;
                }else if(matriz[pos_f+1][pos_c]==3){
                    jugando=false;
                }            
            }
            //Codigo para mover a la Derecha
            if(opcion==3){
                if(matriz[pos_f][pos_c+1]==0){
                   matriz[pos_f][pos_c+1]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f=pos_f;
                   pos_c=pos_c+1;
                }else if(matriz[pos_f][pos_c+1]==3){
                    jugando=false;
                }            
            }
            //Codigo para mover a la Izquierda
            if(opcion==4){
                if(matriz[pos_f][pos_c-1]==0){
                   matriz[pos_f][pos_c-1]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f=pos_f;
                   pos_c=pos_c-1;
                }else if(matriz[pos_f][pos_c-1]==3){
                    jugando=false;
                }            
            }
            //Condicion de movimiento invalido
            if(opcion<1 || opcion>4){
                if(matriz[pos_f-1][pos_c]==0){
                   matriz[pos_f-1][pos_c]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f=pos_f-1;
                   pos_c=pos_c;
                }else if(matriz[pos_f-1][pos_c]==3){
                    jugando=false;
                }            
                System.out.print("MOVIMENTO INCORRECTO");
            }
        }
        System.out.print("GAME OVER-LEVEL COMPLETE");
    } 
}