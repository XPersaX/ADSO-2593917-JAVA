//Pdf 7
import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        System.out.print("=>Ingrese el tamaño del vector:");
        int n=entrada.nextInt();
        int [] arreglo_1=new int [n];
        int resultado=0;
        int acumulador=0;

        int i=1;
        while(i<=numero){
            if(numero%i==0){
                acumulador++;
                System.out.println(i);
            }
            i++;
        }
        if(acumulador==2){
            System.out.print("->El numero es primo,Divisores"+acumulador);
        }else{
            System.out.print("->El numero no es primo,Divisores"+acumulador);
        }
        




    }
}