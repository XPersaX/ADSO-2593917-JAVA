import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        System.out.print("--> Ingresar un numero:");
        int numero=entrada.nextInt();

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