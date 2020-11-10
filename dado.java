
import java.util.Scanner;

public class dado{
    public static void main(String [] agrs){

        Scanner sc = new Scanner(System.in);

        int elDado;
        int elJugador = 0;
        int limiteTablero;
        String interaccionJugador ="";

        limiteTablero = 30;
       

        do {
            System.out.println(" Pulsa para tirar un dado ");
            interaccionJugador = sc.nextLine();
            elDado = (int) (Math.random()*6+1);
            System.out.println("Ha salido [" + elDado + "]");
            elJugador = elJugador + elDado;
            System.out.println("La posicion del jugador:  [" +  elJugador + "]");

            

        } 
        while ( elJugador<=limiteTablero);
    }
}