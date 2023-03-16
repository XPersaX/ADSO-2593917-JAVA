//Pdf 5
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre=entrada.nextLine();
        String invertir="";

        for(int i=nombre.length()-1;i>=0;i--){
            invertir=invertir+nombre.charAt(i);
        }
        System.out.println("Nombre invertido: "+invertir);
    }
}
