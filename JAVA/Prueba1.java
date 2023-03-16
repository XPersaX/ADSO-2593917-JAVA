import java.util.Scanner;

public class Prueba1{
    public static void main (String[] args){

        //ENTRADA
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese La Base :");
        int base= entrada.nextInt();

        System.out.print("Ingrese La Altura:");
        int altura =entrada.nextInt();

        int area_rectangulo=base * altura;
        System.out.println("El Area Es:"+ area_rectangulo);

      


    }

}

