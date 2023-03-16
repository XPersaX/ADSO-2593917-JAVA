import java.util.Scanner;

public class Examen{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingresando cordenadas del punto A");
        System.out.print("Ingrese el valor de x");
        int x=entrada.nextInt();
        System.out.print("Ingrese el valor de y");
        int y=entrada.nextInt();
        System.out.println("Ingresando cordenadas del punto B");
        System.out.print("Ingrese el valor de x");
        int x1=entrada.nextInt();
        System.out.print("Ingrese el valor de y");
        int y1=entrada.nextInt();
        int n1=x*-1;
        int n2=y*-1;
        int operacion=n2+y1;
        int operacion1=n1+x1;
        int suma=operacion/operacion1;
        System.out.println("El valor de la pendiente es: "+suma);
        if(suma<0){
            System.out.print("La recta tiene una Pendiente Negativa");
        }else{
            System.out.print("La recta tiene una pendiente Positiva");
        }

    }
}