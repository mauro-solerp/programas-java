
import java.util.Scanner;

public class tablasMultiplicar{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int numeroUsuario;
        int resultado;

        System.out.println(" De que numero quieres ver sus multiplos ? ");
        numeroUsuario = sc.nextInt();

        System.out.println("-----------------");

        for(int i= 0; i<13; i++){
            resultado = numeroUsuario * i;
            System.out.println(numeroUsuario + " x " + i + " = " + resultado);
        }

        System.out.println("-----------------");

        
    }
}