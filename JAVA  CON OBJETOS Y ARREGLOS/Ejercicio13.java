//Pdf 8
import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        //Pedimos tamaño del arreglo 
        System.out.print("Ingrese un numero: ");
        int n=entrada.nextInt();
        //Creamos el arreglo segun el tamaño indicado
        int arreglo_1 [] = new int [n];
        for(int i=0;i<arreglo_1.length;i++){
            int aleatorio=(int)(Math.random()*1000);
            arreglo_1[i]=aleatorio;
            //Mostramos los numeros guardado en el arreglo y en que posision estan
            System.out.println("{ "+arreglo_1[i]+" } ");
        }

        //Creo variables que nos muestra lo que tenemos en la posision del arreglo
        int reiniciado=n;
        //Creo variable que nos sirve para guardar las posiciones del arreglo
        int guardar=0;

        //Estas variables son igual solo que el proceso va de atras hacia adelante
        int reiniciar=0;
        int guardo=0;
        //Pido la posion al usuario
        System.out.print("Ingrese una posicion: ");
        int pos=entrada.nextInt();
        //Creo la primera condicion del ejercicio  de que si la posicion es mayor que el arreglo
        // recorrer ciclica mente en sentido de las manesilllas del relog
        if(pos>=0){
            //Creo el segundo ciclo para buscar las posisones si el numero es positivo
            for(int j=0;j<pos;j++){
                //Creo condicion para saber si las veces que el ciclo a recorrdio es igual a la pscion 
                //Y imprima dicha posicion y nos rompa el ciclo.
                if(guardo+1==pos){
                    System.out.print("Valor: "+arreglo_1[reiniciar-1]);
                    break;
                }
                //Cuando la posiscion sea igual que el arreglo se reinicie y guarde la posicion del arreglo
                if(reiniciar+1==n){
                    guardo=reiniciar;
                    reiniciar=0;
                }
                //Aqui le comparamos y aumentando para comparar posiciones
                guardo++;
                reiniciar++;
                
            }
         //Creo condicion 2 de que si el usuario ingresa la posision en negativo  se muestre el valor 
         //que se encuentra en dicha posicion
        }else{
            if(pos<0){
                //Creo tercer ciclo para imprimir de forma invertida el arreglo dependiendo
                //la posiscion indicada
                for(int c=pos;c<0;c++){
                    //Creo condicion para saber si las veces que el ciclo a recorrdio es igual a la pscion 
                    //Y imprima dicha posicion y nos rompa el ciclo
                    if(guardar-1==pos){
                        System.out.print("Valor: "+arreglo_1[reiniciado-1]);
                        break;
                    }
                    //Cuando la posiscion sea igual que el arreglo se reinicie y guarde la posicion del arreglo
                    if(reiniciar-1==n){
                        guardar=reiniciado;
                        reiniciar=0;
                    }
                    guardar--;
                    reiniciado--;
                }


            }
        }



    }
}