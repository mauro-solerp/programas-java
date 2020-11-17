
import java.util.Scanner;

public class edificio{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        int plantas;
        int ventanas;
        int espacio;
        int probailidadVentanaAbierta;
        int probailidadVentanaLuz;
        boolean programState;
        
        plantas =  (int)(Math.random()*(10-5))+5;  // Se define el valor entre 10 y 5  

        System.out.println("Plantas = " + plantas);

        programState = true;


        System.out.println("  +--------------+"); //for(int c = 0; c<ventanas; c++) {System.out.print("---");} System.out.println("+");
        for(int i = 0; i<plantas; i++ ){
            System.out.print("  | ");
            ventanas = (int)(Math.random()*(5-0));  // Se define el valor entre 0 y 4
            espacio =  4 - ventanas ;
            for (int b = 1; b <= ventanas; b++){
                probailidadVentanaLuz = (int)(Math.random()*100); 
                probailidadVentanaAbierta = (int)(Math.random()*100); 
                
                if(probailidadVentanaAbierta < 50){
                    if(probailidadVentanaLuz < 50){
                        System.out.print("[ ]");
                    }
                    else{
                        System.out.print("[*]");
                    }  
                }
                else{
                    System.out.print("[#]");
                }
                
            }
            for(int j = 0; j<espacio; j++){
                System.out.print("   ");
            }
            System.out.println(" |");
            

        }
        System.out.println("===================");


        

        
        
        



    }
}