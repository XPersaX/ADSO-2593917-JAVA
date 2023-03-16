import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[]args){
       Scanner entrada=new Scanner(System.in);

       System.out.println("= Ingresar la posicion del n-esimo Fibonacci:>");
       int numero=entrada.nextInt();

       int numero1=0;
       int numero2=1;
       int restar=0;

     for(int i=1;i<=numero;i++){
       restar=numero1+numero2;
       numero1=numero2;
       numero2=restar;
       if(i==numero){
         int suma=restar-numero1;
         System.out.print(" El n-esimo numero Fibonacci es:"+suma);
       }
       
        
      }




   
    }
}

       