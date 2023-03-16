import java.util.Scanner;

public class Ejercicio4{
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
            System.out.println("El numero mayor es:"+ numero1);
        }
        else if(numero2>numero1 && numero2>numero3){
            System.out.println("El numero mayor es:"+ numero2);
        }
        else if (numero3>numero1 && numero3>numero2){
            System.out.println("El numero mayor es:"+ numero3);
        }
        if(numero1<numero2 && numero1<numero3){
            System.out.println("El numero menor es:"+ numero1);
        }
        if(numero2<numero1 && numero2<numero3){
            System.out.println("El numero menor es:"+ numero2);
        }
         if(numero3<numero1 && numero3<numero2){
            System.out.println("El numero menor es:"+ numero3);
        }

    }







}