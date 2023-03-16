import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[]args){

        //Creando variable de entrada

        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese un numero maximo de 6 digito");
        int numero_ingresado= entrada.nextInt();

        //Obtener todos los digitos por separado

        int digito_1=numero_ingresado%10;
        int digito_2=(numero_ingresado/10)%10;
        int digito_3=(numero_ingresado/100)%10;
        int digito_4=(numero_ingresado/1000)%10;
        int digito_5=(numero_ingresado/10000)%10;
        int digito_6=(numero_ingresado/100000);

        //Algoritmo para imprimir el texto del 6to dijito
        if(digito_6==9){
            System.out.print("NOVECIENTOS");
        }
        else if(digito_6==8){
            System.out.print("OCHOCIENTOS");
        }
         else if(digito_6==7){
            System.out.print("SETECIENTOS");
        }
         else if(digito_6==6){
            System.out.print("SEICIENTOS");
        }
         else if(digito_6==5){
            System.out.print("QUNIENTOS");
        }
         else if(digito_6==4){  
            System.out.print("CUATROCIENTOS");
        }
         else if(digito_6==3){
            System.out.print("TRECIENTOS");
        }
         else if(digito_6==2){
            System.out.print("DOCIENTOS");
        }else if(digito_6==1){
            if(digito_5==0 && digito_4==0){
                System.out.print("CIEN");
            }else{
                System.out.print("CIENTO");
            }
        }else if(digito_6==0){
            System.out.print("");
        }

        //Algoritmo para  imprimir el texto del 5to digito
        if(digito_5==9){
            if(digito_4==0){
                System.out.print("NOVENTA");
            }else{
                System.out.print("NOVENTA Y");
            }
        }else if(digito_5==8){
            if(digito_4==0){
                System.out.print("OCHENTA");
            }else{
                System.out.print("OCHENTA Y");
            }
        }else if(digito_5==7){
            if(digito_4==0){
                System.out.print("SETENTA");
            }else{
                System.out.print("SETENTA Y");
            }
        }else if(digito_5==6){
            if(digito_4==0){
                System.out.print("SESENTA");
            }else{
                System.out.print("SESENTA Y");
            }
        }else if(digito_5==5){
            if(digito_4==0){
                System.out.print("CINCUENTA");
            }else{
                System.out.print("CINCUENTA Y");
            }
        }else if(digito_5==4){
            if(digito_4==0){
                System.out.print("CUARENTA");
            }else{
                System.out.print("CUARENTA Y");
            }
        }else if(digito_5==3){
            if(digito_4==0){
                System.out.print("TREINTA");
            }else{
                System.out.print("TREINTA Y");
            }
        }else if(digito_5==2){
            if(digito_4==0){
                System.out.print("VEINTE");
            }else{
                System.out.print("VEINTI");
            }
        }else if(digito_5==1){
            if(digito_4==0){
                System.out.print("DIEZ");
            }else if(digito_4==1){
                System.out.print("ONCE");
            }else if(digito_4==2){
                System.out.print("DOCE");
            }else if(digito_4==3){
                System.out.print("TRECE");
            }else if(digito_4==4){
                System.out.print("CATORCE");
            }else if(digito_4==5){
                System.out.println("QUINCE");
            }else{
                System.out.print("DIECI");
            }
        }else if(digito_5==0){
            System.out.print("");
        }

        //Algoritmo para imrpimir el texto del 4to digito.
         if(digito_4==9){
                System.out.print("NUEVE MIL  ");
        }else if(digito_4==8){
                    System.out.print("OCHO MIL  ");
        }else if(digito_4==7){
                    System.out.print("SIETE MIL  ");
        }else if(digito_4==6){
                    System.out.print("SEIS MIL  ");
        }else if(digito_4==5){
                    System.out.print("CINCO MIL  ");
        }else if(digito_4==4){
                    System.out.print("CUATRO MIL  ");
        }else if(digito_4==3){
                    System.out.print("TRES MIL ");
        }else if(digito_4==2){
                    System.out.print("DOS MIL  ");
        }else if(digito_4==1){
                    System.out.print("  MIL ");
        }
        //algoritmo para imprimir el tercer digito
        if(digito_3==9){
                System.out.print("NOVECIENTOS ");
        }else if(digito_3==8){
                System.out.print("OCHOCIENTOS ");
        }else if(digito_3==7){
                System.out.print("SETECIENTOS ");
        }else if(digito_3==6){
                System.out.print("SEICIENTOS ");
        }else if(digito_3==5){
                System.out.print("QUINIENTOS ");
        }else if(digito_3==4){
                System.out.print("CUATROCIENTOS ");
        }else if(digito_3==3){
                System.out.print("TRECIENTOS ");
        }else if(digito_3==2){
                System.out.print("DOCIENTOS ");
        }
        //ALGORITMO PARA IMPRIMIR EL SEGUNDO DIGITO
        if(digito_2==9){
            if(digito_1==0){
                System.out.print("NOVENTA ");
            }else{
                System.out.print("NOVENTA Y ");
            }
        }else if(digito_2==8){
            if(digito_1==0){
                System.out.print("OCHENTA ");
            }else{
                System.out.print("OCHENTA Y ");
            }
        }else if(digito_2==7){
            if(digito_1==0){
                System.out.print("SETENTA ");
            }else{
                System.out.print("SETENTA Y ");
            }
        }else if(digito_2==6){
            if(digito_1==0){
                System.out.print("SESENTA ");
            }else{
                System.out.print("SESENTA Y ");
            }
        }else if(digito_2==5){
            if(digito_1==0){
                System.out.print("CINCUENTA ");
            }else{
                System.out.print("CINCUENTA Y ");
            }
        }else if(digito_2==4){
            if(digito_1==0){
                System.out.print("CUARENTA ");
            }else{
                System.out.print("CUARENTA Y ");
            }
        }else if(digito_2==3){
            if(digito_1==0){
                System.out.print("TREINTA ");
            }else{
                System.out.print("TREINTA Y ");
            }
        }else if(digito_2==2){
            if(digito_1==0){
                System.out.print("VEINTE ");
            }else{
                System.out.print("VEINTE Y ");
            }
        }else if(digito_2==1){
            if(digito_1==0){
                System.out.print("DIEZ ");
            }else{
                System.out.print("DIEZ Y ");
            }
        }
        //ALGORITMO PARA IMPRIMIR EL PRIMER DIGITO
        if(digito_1==9){
            System.out.print("NUEVE ");
        }else if(digito_1==8){
            System.out.print("OCHO ");
        }else if(digito_1==7){
            System.out.print("SIETE ");
        }else if(digito_1==6){
            System.out.print("SEIS ");
        }else if(digito_1==5){
            System.out.print("CINCO ");
        }else if(digito_1==4){
            System.out.print("CUATRO ");
        }else if(digito_1==3){
            System.out.print("TRES ");
        }else if(digito_1==2){
            System.out.print("DOS ");
        }else if(digito_1==1){
            System.out.print("UNO");
        }
        if(digito6==0 && digito5==0 && digito4==0 && digito3==0 && digito2==0 && digito1==0){
            System.out.print("ingrese un numero que sea mayor a 0 ");
        }










       
        
     

       

        
    }
}
