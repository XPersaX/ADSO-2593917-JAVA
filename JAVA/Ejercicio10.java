import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        float primera_nota;
        float segunda_nota;
        float tercera_nota;
        float cuarta_nota;
        float quinta_nota;
        

        System.out.println("Ingrese su nota de Matemáticas");
        primera_nota=entrada.nextFloat();
        System.out.println("Ingrese su  nota de Español");
        segunda_nota=entrada.nextFloat();
        System.out.println("Escriba su nota de Ingles");
        tercera_nota=entrada.nextFloat();
        System.out.println("Escriba su nota de Ciencias Naturales");
        cuarta_nota=entrada.nextFloat();
        System.out.println("Escriba su nota de Deportes");
        quinta_nota=entrada.nextFloat();
        if(primera_nota>segunda_nota && primera_nota>tercera_nota&& primera_nota>cuarta_nota && primera_nota>quinta_nota){
            System.out.println("La Aisignatura con la mayor nota es :Matemáticas");
        }
        else if(segunda_nota>primera_nota && segunda_nota>tercera_nota && segunda_nota>cuarta_nota && segunda_nota>quinta_nota){
            System.out.println("La Asignatura con la mayor nota es :Español");
        }
        else if(tercera_nota>primera_nota && tercera_nota>segunda_nota && tercera_nota>cuarta_nota &&tercera_nota>quinta_nota){
            System.out.println("La Asignatura con la mayor nota es:Ingles");
        }
        else if(cuarta_nota>primera_nota && cuarta_nota>segunda_nota && cuarta_nota>tercera_nota && cuarta_nota>quinta_nota){
            System.out.println("La Asignatura con la mayor nota es :Ciencias Naturales");
        }
         else if(quinta_nota>primera_nota && quinta_nota>segunda_nota && quinta_nota>tercera_nota && quinta_nota>cuarta_nota){
                System.out.println("La Asignatura con la mayor nota es :Deportes");
            }
             if(primera_nota<segunda_nota && primera_nota<tercera_nota && primera_nota<cuarta_nota &&primera_nota<quinta_nota){
                System.out.println("La Asignatura con menor nota es:Matemáticas");
            }
            else if(segunda_nota<primera_nota&&segunda_nota<tercera_nota&&segunda_nota<cuarta_nota&&segunda_nota<quinta_nota){
                System.out.println("La Asignatura con menor nota es :Español ");
            }
            else if(tercera_nota<primera_nota && tercera_nota<segunda_nota && tercera_nota<cuarta_nota &&tercera_nota<quinta_nota){
                System.out.println("La Asignatura con menor nota es:INgles");
            }
            else if(cuarta_nota<primera_nota && cuarta_nota<segunda_nota &&cuarta_nota<tercera_nota && cuarta_nota<quinta_nota){
                System.out.println("La Asignatura con menor nota es:Ciencias Naturales");
            }
            else if(quinta_nota<primera_nota && quinta_nota<segunda_nota && quinta_nota<tercera_nota && quinta_nota<cuarta_nota){
                System.out.println("La Asignatura con menor nota es :Deportes");
            }
            float promedio=(primera_nota+segunda_nota+tercera_nota+cuarta_nota+quinta_nota)/5;
            System.out.print("EL PROMEDIO DE LAS NOTAS ES:"+promedio);
            
            if(promedio<3){
                System.out.print("Devio optener una nota de ")
            }

    }

}