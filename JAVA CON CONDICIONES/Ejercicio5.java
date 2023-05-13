import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Ingrese el primer numero");
        numero1=entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=entrada.nextInt();
        System.out.println("Ingrese el tercer numero");
        numero3=entrada.nextInt();
        if(numero1>numero2 && numero1>numero3){
            System.out.println("Los numeros se ingresaron en orden Descendente");
        }
        else if(numero1<numero2 && numero1<numero3){
            System.out.println("Los numeros se ingresaron en orden Ascendente");
        }
        else
        System.out.println("Los numeros se ingresaron en desorden");
        
    }
} 