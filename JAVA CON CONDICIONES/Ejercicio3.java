import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        int x;
        int y;

        System.out.println("Escriba el valor de x ");
        x=entrada.nextInt();
        System.out.println("Escriba el valor de y");
        y=entrada.nextInt();
        if(x<=0 && y>=0){
            System.out.print("La cordenadada ingresada se encuentra en el segundo cuadrante");
        }
        else if(x>=0 && y >=0){
            System.out.print("La cordenada ingresada se encuentra en primer cuadrante");
        }
        else if(x<=0 && y <=0){
            System.out.print("Las cordenadas ingresadas se encuentran en el tercer cuadrante");
        }
        else if(x>=0 && y<=0){
            System.out.print("Las cordenadas ingresadas se encuentran en el cuarto cuadrante");
        }


    }

}