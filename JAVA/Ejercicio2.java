import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        int valor;
     System.out.println("ESCRIBA UN NUMERO DE 3 DIGITOS");
     valor=entrada.nextInt();
     int codigo=valor % 2 ;
     if(codigo==0){
        System.out.print("Par");
     }
     else{
        System.out.print("Impar");
     }

        






    }











}