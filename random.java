
import java.util.Scanner;

public class random{
    public static void main (String [] args){
        
        int aleatorio = (int) (Math.random()*100);
        int jugar = 1;
        int intentos = 5;
        
        //System.out.println("El numero es " + aleatorio);

        Scanner sc = new Scanner(System.in);

        System.out.println("Que numero estoy pensado? ");
        int a = sc.nextInt();

        while (jugar == 1 && intentos > 0) {

            if (aleatorio == a){
                System.out.println("Adivinaste mi numero");
                jugar = 0;

            }
            else if (aleatorio <= a){
                System.out.println("Mi numero es MENOR al que estas pensando");
                System.out.println("Intentalo de nuevo.. " + " Te quedan " + intentos + " intentos ");
                a = sc.nextInt();
                intentos = (intentos - 1);

            }
            else{
                System.out.println("Mi numero es MAYOR al que estas pensando");
                System.out.println("Intentalo de nuevo.. " + " Te quedan " + intentos + " intentos");
                a = sc.nextInt();
                intentos = (intentos - 1);
            }

            if( intentos == 0) {
                System.out.print("Se te han acabado los intentos " + " el numero era " + aleatorio );
            }
        }   
    }   
}