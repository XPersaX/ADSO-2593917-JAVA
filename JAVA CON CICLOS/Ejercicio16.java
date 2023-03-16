import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese un numero N :");
        int numeron=entrada.nextInt();
        System.out.print("Ingrese numero M:");
        int numerom=entrada.nextInt();
        int suma=1;
        for(int i=numeron;i<=numerom;i++){
            for( int j=1;j<=i;j++){
                suma=suma*j;
                if(j==i){
                    System.out.print(j+ "=");
                }else{
                    System.out.print(j+ "*");
                }
                if(i==j){
                    System.out.println(suma);
                    suma=1;
                }
        
            }

        }

    }
}