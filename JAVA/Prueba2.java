import java.util.Scanner;

public class Prueba2{
    public static void main(String[]args){
        //Creacion de variable de entrada.
        Scanner entrada=new Scanner(System.in);


        //creacion de variable
        int cant_poblacion_col=30000000;
        int cant_poblacion_usa=350000000;

        //Istrucion de salida
        System.out.println("La poblacion de colombia es:"+cant_poblacion_col);
        System.out.println("La poblacion de USA es :"+cant_poblacion_usa);

        //Lectura de datos
        System.out.print("Ingrese la poblacion de COL");
        cant_poblacion_col=entrada.nextInt();

        System.out.println("La nueva poblacion de COL es"+cant_poblacion_col);

    }
}