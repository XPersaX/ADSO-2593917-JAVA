import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        float suma_credito=0;
        float suma_suma=0;


        System.out.print("Ingrese cantidad de materias");
        int cantidad_notas=entrada.nextInt();
        for(int i=1;i<=cantidad_notas;i++){
            System.out.println("Nota Materia"+i+":");
            float nota=entrada.nextFloat();
            System.out.println("Credito Materia"+i);
            float credito=entrada.nextFloat();
            float multiplicacion=nota*credito;

            suma_credito=suma_credito+credito;
            suma_suma=suma_suma+nota;
          
        }
        float promedio=suma_suma/cantidad_notas;
        System.out.println("=>Total de Creditos"+suma_credito);
        System.out.println("=>Promedio del semestre"+promedio);
           

    }
        
}

       

     

        