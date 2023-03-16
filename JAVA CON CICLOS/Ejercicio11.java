import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese un numero entre 1 y 6 :");
        int numero=entrada.nextInt();
        int acum=0;
        for(int i=1;i<=numero;i++){
            int aleatorio=(int)(Math.random()*10);
            acum=(acum*10)+aleatorio;
        }
        System.out.print("El numero construido es :"+acum);
        int producto=acum*2;
        System.out.println("");
        System.out.print("Resultado producto:"+producto);
      




    }
}