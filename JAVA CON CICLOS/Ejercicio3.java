import java.util.Scanner;

public class Ejercicio3{
     public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese la altura que desea");
        int altura=entrada.nextInt();

        for(int i=1;i<=altura;i++){
            int multiplicacion=(2*i)-1;
            int n=altura-i;
            for(int m=0;m<=n;m++){
               System.out.print(" ");
            }

            for(int j=0;j<multiplicacion;j++){
               System.out.print("X");
            }
            System.out.println();
        }

     }
}