import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);

        int numero_ingresado;
        int opcion;
        int digito;

        System.out.println("Ingrese un numero de 6 digitos");
        numero_ingresado=entrada.nextInt();
        System.out.println("Menu");
        System.out.println("1.Primer Digito   2.Segundo Digito  3.Tercer Digito");
        System.out.println("4.Cuarto Digito   5.Quinto Digito   6. Sexto Digito");
        System.out.println("Ingrese una opcion");
        opcion=entrada.nextInt();
        if(opcion==1){
        digito=numero_ingresado%10;
        System.out.println("El Primer Digito Es :"+digito);
        }
        else if(opcion==2){
            digito=(numero_ingresado/10)%10;
            System.out.println("El Segundo Digito Es :"+digito);
        }
        else if(opcion==3){
            digito=(numero_ingresado/100)%10;
            System.out.println("El Tercer Digito Es :"+digito);
        }
        else if(opcion==4){
            digito=(numero_ingresado/1000)%10;
            System.out.println("El Cuarto Digito Es:"+digito);
        }
        else if(opcion==5){
            digito=(numero_ingresado/10000)%10;
            System.out.println("El Quinto Digito Es:"+digito);
        }
        else if(opcion==6){
            digito=(numero_ingresado/100000)%10;
            System.out.println("El Sexto Numero Ingresado Es:"+digito);
        }

    }
}