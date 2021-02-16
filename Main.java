
import java.util.Scanner;

public class Main {
    static void mulOperators(float x, float  y) {
      System.out.println("La multiplicacion de ( " + x + " x " + y + ") es [" + (x*y) + "]" );
      System.out.println("La division de ( " + x + " x " + y + ") es [" + (x/y) + "]" );
      System.out.println("La suma de ( " + x + " x " + y + ") es [" + (x+y) + "]" );
      System.out.println("La resta de ( " + x + " x " + y + ") es [" + (x-y) + "]" );
      
    }
  
    public static void main(String[] args) {
      float x=0;
      float y=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa un numero " );
      x = sc.nextFloat();
      System.out.println("Ingresa multiplicador" );
      y = sc.nextFloat();

      mulOperators(x, y);


    }
  }