//Pdf 7
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese un numero entero");
        int n=entrada.nextInt();
        int [] arreglo_1=new int [n];

        for(int i=0;i<arreglo_1.length;i++){
            int aleatorio=(int)(Math.random()*1000);
            arreglo_1[i]=aleatorio;
        }
        for(int i=0;i<arreglo_1.length;i++){
            System.out.print(" [" +arreglo_1[i]+"]");
        }

    }
}