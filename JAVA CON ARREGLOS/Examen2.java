import java.util.Scanner;

public class Examen2{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("=>Ingrese la cantidad de numeros enteros que desea generar:");
        int n=entrada.nextInt();
        int [] arreglo_1=new int [n];
        int i=0;
        while(i<arreglo_1.length){
            arreglo_1[i]= (int)(Math.random()*9999);
            int acum=0;
            int j=1;
            while(j<=arreglo_1[i]){
                if(arreglo_1[i]%j==0){
                    acum++;
                }
                j++;
            }
            if(acum==2){
                //Determinar si esta repetido
                boolean valido=true;
                for(int h=0;h<arreglo_1.length;h++){
                    if(arreglo_1[h]==arreglo_1.length){
                        valido=false;
                    }
                }
                if(valido){
                    arreglo_1[i]=arreglo_1.length;
                }
                System.out.println("=>El numero "+i+ "Generado es " +arreglo_1[i]);
                i++;
            }
        }

        
    }
}