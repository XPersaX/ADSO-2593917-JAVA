import java.util.Scanner;

public class Ejemplo{
    public static void main(String[]args){
        //Variable de datos
        Scanner entrada=new Scanner(System.in);

        //Pedir texto al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre=entrada.nextLine();

        //Pruebas
        System.out.println("Valor almacenado=> "+nombre);
        //Metodo length
        System.out.println("Cantidad de letras=> "+nombre.length());
        //Metoto charAt
        System.out.println("Letra en pos 0=>" +nombre.charAt(0));
        System.out.println("Letra en pos 1=>" +nombre.charAt(1));
        System.out.println("Letra en pos 2=>" +nombre.charAt(2));
        System.out.println("Letra en pos 3=>" +nombre.charAt(3));
        
        //Metodo CompareTo
        String palabra_1="Hola";
        String palabra_2="Mundo";
        System.out.println("CompareTo P1 a P2: "+palabra_1.compareTo(palabra_2) ); 
        System.out.println("CompareTo P2 a P1: "+palabra_2.compareTo(palabra_1) );
        String palabra1="a";
        String palabra2="A";
        System.out.println("CompareTo P1 a P2: "+palabra1.compareTo(palabra2) ); 
        System.out.println("CompareTo P2 a P1: "+palabra2.compareTo(palabra1) );
        //Metodo equals
        String palabraa1="a";
        String palabraa2="A";
        System.out.println("equals P1 a P2: "+palabraa1.equals(palabraa2) ); 
        System.out.println("equals P2 a P1: "+palabraa2.equals(palabraa1) );

        //Metodo equalsIgnore
        String palab1="a";
        String palab2="A";
        System.out.println("equalsignoreCase P1 a P2: "+palab1.equalsignoreCase(palab2) ); 
        System.out.println("equalsignoreCase P2 a P1: "+palab2.equalsignoreCase(palab1) );
    }
}