import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese un numero N");
        int numero=entrada.nextInt();
        int suma=1;
        for(int i=1;i<=numero;i++){
            suma=suma*i;
        }
        System.out.print("Factorial:"+suma);


    }
}