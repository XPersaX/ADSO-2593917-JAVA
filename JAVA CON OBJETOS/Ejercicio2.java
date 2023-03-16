import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        

        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingresar una oracion: ");
        String oracion = entrada.nextLine(); 
        System.out.print("Oracion invertida:");
        for(int i=0;i<oracion.length();i++){
            // Extraer la Letra
            char letra = oracion.charAt(i);
            int codigo = (int) letra;

            // Preguntar si la letra es Mayuscula
            if( codigo>=65 && codigo<=90 ){
                // Convertir la letra a minuscula
                char nuevo = (char) (codigo+32);
                // Imprimirla sin saltar de linea
                System.out.print(" "+nuevo);
                
            }else{
                // Preguntar si la letra es Minuscula
                if(codigo>=97 && codigo<=122){
                    // Convertir la letra a mayuscula
                    char nuevo = (char) (codigo-32);
                    // Imprimirla sin saltar de linea
                    System.out.print(""+nuevo);
                }
            }
        }

        
    }
}