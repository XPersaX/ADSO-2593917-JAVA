import java.util.Scanner;

public class Examen4{
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("--> Ingrese area inicial de la bacteria en cm2:");
        double area=entrada.nextInt();
        System.out.print("--> Ingrese area total del metal a consumir:");
        int area1=entrada.nextInt();
        // double aumento=0;
        // double deciende=0;
        double resta=0;
        double acum=0;
        boolean repetir=true;
        int i=0;
        while(repetir){
            i++;
            double aumento=(area*300)/100;
            double deciende=aumento*0.7;
            resta=aumento-deciende;
            area=deciende;
            System.out.println("Dia"+i);
            System.out.println("Creciendo"+aumento);
            acum++;
            if(aumento>area1){
                repetir=false;
            }else{
                System.out.println("Decreciendo"+resta);
    
            }
        }
        System.out.println("|--> Total de días para consumir el metal fue:"+(acum-0.5));

    }
}