import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("=> Ingrese un sueldo Total:");
        int sueldo=entrada.nextInt();
        System.out.print("=> Cantidad de Pagos:");
        int pagos=entrada.nextInt();
        System.out.println("-----Formas de pago-----");
        System.out.println("1.Pagos de igual valor");
        System.out.println("2.Primer pago diferente");
        System.out.println("3.Ultimo pago diferente");
        System.out.println("4.Primer y ultimo pago diferente");
        System.out.println("=> Ingrese forma de Pago:");
        int forma=entrada.nextInt();
        if(forma==1){
            int valor_a_pagar =sueldo/pagos;
            for(int i=1;i<=pagos;i++){
                System.out.println( "Mes" +i+ ":$" +valor_a_pagar);
            }
        }else if(forma==2){
            System.out.print(" Ingrese el valor del primer pago ");
            int sueldo1=entrada.nextInt();
            int resta=sueldo-sueldo1;
            int total=resta/(pagos-1);
            System.out.println("Mes:$"+ sueldo1);
            for( int i=1;i<=pagos-1;i++){
                System.out.println("Mes"+i+":$" +total);

            }

        }else if(forma==3){
            System.out.print(" Ingrese el valor del ultimo pago ");
            int sueldo1=entrada.nextInt();
            int resta=sueldo-sueldo1;
            int total=resta/(pagos-1);
            for(int i=1;i<=pagos-1;i++){
                System.out.println("Mes"+i+":$" +total);
            }
            System.out.println("Mes5:$"+ sueldo1);
        }else if(forma==4){
            System.out.print(" Ingrese el valor del primer pago ");
            int primero=entrada.nextInt();
            System.out.print(" Ingrese el valor del ultimo pago ");
            int ultimo=entrada.nextInt();
            int resta=sueldo-primero;
            int resta1=sueldo-ultimo;
            int total=resta/(pagos-1);
            int total1=resta1/(pagos-1);
            int fin=resta+resta1;
            int resta2=sueldo-fin;
            int los_dos=resta2/(pagos-1);
            System.out.println("Mes:$"+primero);
            for(int i=1;i<=pagos-1;i++){
                System.out.println("Mes"+i+":$" +los_dos);
            }
            System.out.println("Mes:$"+ultimo);
            
        }
    }
}
