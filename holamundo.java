
import java.util.Scanner;

public class holamundo{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valor de priemer nuemro ");
        int a = sc.nextInt();

        System.out.println("Ingrese valor de segundo numero ");
        int b = sc.nextInt();

        System.out.println("Ingrese valor de tercer numero ");
        int c = sc.nextInt();


        int primero = a/100;
        int segundo = (b - ((b/100)*100)) /10;
        int tercero = (c - ((c/10)*10));

        System.out.println("primer digito " + primero + " segundo digito " + segundo + " tercer digito " + tercero);
        System.out.println("+-----------------------+");
        System.out.println("| el resltado es : " + primero + segundo + tercero + "  |");
        System.out.println("+-----------------------+");

        System.out.println("Ingrese la temperatura ");
        int temperatura = sc.nextInt();

        if(temperatura < 0){
            System.out.println("Solido");
        }
        else if (temperatura > 100){
            System.out.println("Gaseoso");
        }
        else{
            System.out.println("Liquido");
        }
    } 
}