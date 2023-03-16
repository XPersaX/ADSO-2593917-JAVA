import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[]args){

       Scanner entrada=new Scanner(System.in);

       System.out.print("Ingrese un numero");
       int numero=entrada.nextInt();
       
       //invertir numero
       int invertido=0;

       for(int i=1;i<=6;i++){
           int ultimo=numero%10;
           invertido=(invertido*10)+ultimo;
           numero=numero/10;
           if(numero==0){
                break;
           }
       }
       numero=invertido;





    }
}