//Pdf 5
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingresar una oracion: ");
        String oracion=entrada.nextLine();
        int acum=0;
        for(int i=0;i<oracion.length();i++){
            if(oracion.charAt(i)=='a' || oracion.charAt(i)=='A' || oracion.charAt(i)=='e' || oracion.charAt(i)=='E' || oracion.charAt(i)=='i' || oracion.charAt(i)=='I' || oracion.charAt(i)=='o' || oracion.charAt(i)=='O' || oracion.charAt(i)=='u' || oracion.charAt(i)=='U'){
             acum=acum+1;
            }
        }
        System.out.println("La cantidad de vocales es:"+acum);
    }
}