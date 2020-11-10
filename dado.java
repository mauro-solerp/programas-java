
import java.util.Scanner;

public class dado{
    public static void main(String [] agrs){

        Scanner sc = new Scanner(System.in);

        int elDado;
        int elJugador1 = 0;
        int elJugador2 = 0;
        int elJugador3 = 0;
        int elJugador4 = 0;
        int limiteTablero;
        String interaccionJugador ="";

        limiteTablero = 30;
       

        do {
            System.out.println(" Pulsa para tirar un dado ");
            interaccionJugador = sc.nextLine();
            elDado = (int) (Math.random()*6+1);
            elJugador1 = elJugador1 + elDado;
            for (int i; i<=elJugador1; i ++;) {System.out.print("-")System.out.println("JP1:  [" +  elJugador1 + "]");}
        
            elDado = (int) (Math.random()*6+1);
            elJugador2 = elJugador2 + elDado;
            for (int i; i<=elJugador2; i ++;) {System.out.print("-")System.out.println("JP2:  [" +  elJugador2 + "]");}

            elDado = (int) (Math.random()*6+1);
            elJugador3 = elJugador3 + elDado;
            for (int i; i<=elJugador3; i ++;) {System.out.print("-")System.out.println("JP3:  [" +  elJugador3 + "]");}

            elDado = (int) (Math.random()*6+1);
            elJugador4 = elJugador4 + elDado;
            for (int i; i<=elJugador4; i ++;) {System.out.print("-")System.out.println("JP3:  [" +  elJugador4 + "]");}


        } 
        while ();
    }
}