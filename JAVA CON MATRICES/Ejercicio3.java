import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){
        //Declarar la variante de entrada
        Scanner entrada=new Scanner(System.in);
        //Solicitar al usuario el dato
        System.out.print("Escriba el numero de cedulas que desea almacenar: ");
        int c=entrada.nextInt();
        //Crear arreglo
        long arreglo []=new long [c];
        //Definir ciclo
        for(int i=0;i<arreglo.length;i++){
            //Definir ciclo
            System.out.println("Ingrese el numero de la cedula "+i);
            long n=entrada.nextLong();
            //Validar la cedula
            boolean valido=true;
            for(int j=0;j<arreglo.length;j++){
                if(n==arreglo[j]){
                    valido=false;

                }
            }
            if(valido){
                //Si-> almacenar cedula
                arreglo[i]=n;
            }else{
                //No->Mensaje error
                System.out.println("--La cedula se encuentra repetida--");
                //Para mermar una poscicion
                i--;
            }

        }
        //Imprimir el arreglo completo
        for(int i=0;i<arreglo.length;i++){
            System.out.println("-cedula "+i+": "+arreglo[i]);
        }
    } 
}