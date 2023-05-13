import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        System.out.println("Hola Senor Usurario");
        System.out.println("Escriba su edad");
        int edad=entrada.nextInt();
        if(edad>1 && edad<=150){
            if (edad<=18){;
            System.out.print("USTED RECIBE UN AUXILIO DE $800.000 ");
        } else{
            System.out.print("USTED PAGA UN IMPUESTO DE $200.000");
        }
        }else{
            System.out.print("LOS DATOS INGRESADOS NO SON CORRECTOS");
        }
          
    
    

    }

   

}