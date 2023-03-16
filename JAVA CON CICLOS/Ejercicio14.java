import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("=>Ingrese un numero N maximo de 6 digitos");
        int numero=entrada.nextInt();
        int invertido=0;
        int original=numero;
        int i=0;
        while(numero!=0){
            int ultimo=numero%10;
            invertido=(invertido*10)+ultimo;
            numero=numero/10;
        }
        if(invertido==original){
            System.out.print("=>El numero SI es PALINDROMO");
        }
        else{
            System.out.print("=> El numero NO es PALINDROMO");
        }

    }
}