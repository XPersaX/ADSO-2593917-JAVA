import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        //Pedir datos al usuario
        System.out.print("Ingrese la cantidad de las notas");
        int cantidad=entrada.nextInt();

        float sumatoria=0;
        for(int i=1;i<=cantidad;i++){
            System.out.print("->Ingrese la nota"+i+":");
            float nota =entrada.nextFloat();
            sumatoria=sumatoria+nota;
            //Tambien se podria 
            //Sumatoria=i++

        }

        //Sacar promedio
        float promedio=sumatoria/cantidad;
        System.out.print("=>El promedio es:"+promedio);

        
    }
}