import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[]args){
       Scanner entrada=new Scanner(System.in);

       System.out.println("=>Ingrese un numero");
       int numero=entrada.nextInt();

       int numero1=0;
       int numero2=1;
       int restar=0;

       for(int i=1;i<=numero;i++){
        if(i==1){
            System.out.print("0");
        }else if(i==2){
            System.out.print(",");
            System.out.print("1");
            System.out.print(",");
        }else{
            restar=numero1+numero2;
            numero1=numero2;
            numero2=restar;
            System.out.print(+restar);
            System.out.print(",");
            
        }
        
       }

    }




}