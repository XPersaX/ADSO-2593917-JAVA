//Pdf 5
import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra=entrada.nextLine();
        String invertir="";

        for(int i=palabra.length()-1;i>=0;i--){
            invertir=invertir+palabra.charAt(i);
        }
        if(invertir!=palabra){
            System.out.print("La palabra "+palabra+" Es Palindroma");
        }else{
            System.out.print("La palabra "+palabra+ " No es Palindroma");
        }
        
    }
}
