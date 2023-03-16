//Pdf 7
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("=>Ingrese el tamaño del vector:");
        int n=entrada.nextInt();
        int arreglo_1[] =new int [n];
        for(int i=0;i<arreglo_1.length;i++){
            int j=i+1;
            arreglo_1[i]=(j*2)-1;
        }
        for(int i=0;i<arreglo_1.length;i++){
            System.out.print(" [" +arreglo_1[i]+"]");
        }
    }
}