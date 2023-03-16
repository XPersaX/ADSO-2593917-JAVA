import java.util.Scanner;
public class Ejer7{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero N donde es la altura y el ancho-->  ");
        int n1 = entrada.nextInt();

        for (int i=0; i<=n1; i++) {
            for (int k=n1-i; k>0; k--) {
                System.out.print(" ");
            }
            for (int k=0; k<i;k++) {
                System.out.print(" x");
            }
            System.out.println("");
        }

        for (int i=0; i<=n1; i++) {
            for (int k=0; k<=i; k++) {
                System.out.print(" ");
            }
            for (int k=n1-i-1; k>0; k--) {
                System.out.print(" x");
            }
            System.out.println("");
        }
    }
}