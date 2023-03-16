//Pdf 5
import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese un nombre: ");
        String nombre=entrada.nextLine();
        //Menu de opciones
        System.out.println("Selecione alguna de las 2 opciones en el menu");
        System.out.println("1-Iniciar Juego");
        System.out.println("2-Salir");
        String opcion=entrada.nextLine();
        //Palabra secreta
        String palabra="carolina";
    }
}