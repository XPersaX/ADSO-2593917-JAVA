import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);

        int j=0;
        while(j!=3){
        System.out.println("|------Bienvenido------|");
        System.out.println("|      1.Docengte      |");
        System.out.println("|      2.Estudiante    |");
        System.out.println("|      3.Salir         |");
        System.out.println("|----------------------|");

        System.out.println("Ingrese una opción:");
        int opcion=entrada.nextInt();
        if(opcion==1){
            System.out.print("--EJERCICIO 1--");
            System.out.print("Ingrese la cantidad de notas");
            int cantidad=entrada.nextInt();
            float sumatoria=0;
            for(int i=1;i<=cantidad;i++){
                System.out.print("Ingrese la nota"+i+":");
                float nota=entrada.nextFloat();
                sumatoria=sumatoria+nota;
            }
            float promedio=sumatoria/cantidad;
            System.out.print("=>El promedio es:"+promedio);

        }
        else if(opcion==2){
            System.out.print("--EJERCICIO 2--");
            float suma_credito=0;
            float suma_suma=0;

            System.out.print("Ingrese la cantidad de notas");
            int cantidad_notas=entrada.nextInt();
            for(int i=1;i<=cantidad_notas;i++){
                System.out.print("Nota materia"+i+":");
                float nota=entrada.nextFloat();
                System.out.print("Credito materia"+i);
                float credito=entrada.nextFloat();
                float multiplicacion=nota*credito;

                suma_credito=suma_credito+credito;
                suma_suma=suma_suma+nota;
                
            }
            float promedio=suma_suma/cantidad_notas;
            System.out.println("=>Total de Creditos"+suma_credito);
            System.out.println("=>Promedio del semestre"+promedio);

        }
        else if(opcion==3){
            System.out.println("--SALIENDO--");
        }

        }
    

        


        
    }
}
    

