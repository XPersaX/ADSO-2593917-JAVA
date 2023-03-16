//Pdf 6
import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);
        System.out.print("Señor usuario ingrese una contraseña");
        String contraseña=entrada.nextLine();

        for(int i=0;i <contraseña;i++){
            char letra=contraseña.charAt(i);
            int codigo=(int) letra;


            for(int j=0;j<1;j++){
                if(codigo>=65 && codigo<=90){
                    char nuevo=(char) (codigo);
                    System.out.print("La contraseña es correcta: "+nuevo);
                }else{
                    System.out.print("L acontraseña no es correcta")
                }
            }
            
        }
    }
}