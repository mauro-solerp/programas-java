
import java.util.Scanner;

public class array2d{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        int[][] a = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}

        };
        int jugadorfila;
        int jugadorColumna;
        int manzanaFila;
        int manzanaColumna;
        int longitud;
        boolean manzana;
        String interaccionJugador = "";
        boolean jugar = true;
        jugadorfila = 7;
        jugadorColumna = 8;
        manzanaFila = 4;
        manzanaColumna = 4;
        manzana = true;
        longitud = 1;

        
        while(jugar){
            if( manzana == false){
                manzanaFila = (int)(Math.random()*(15-2))+2;
                manzanaColumna = (int)(Math.random()*(11-2))+2;
                manzana = true;
            }
            

            System.out.println("+------------------------------------------+");
            for(int i = 0; i<a.length; i++){  //Fila i
                
                for(int j = 0; j<a[i].length; j++){ //Columna j

                    if(i == jugadorfila && j == jugadorColumna){
                        for(int l = 0; l < longitud; l++){
                            System.out.print("~~");
                        }
                        
                    } 
                    else if(i == manzanaFila && j == manzanaColumna){
                        System.out.print("OO");
                    }
                    else {
                        if(a[i][j]==1){System.out.print("[]");}
                        else if(a[i][j]==0){System.out.print("  ");}
                    }
                }
                System.out.println(" ");
            }
            System.out.println("+------------------------------------------+");
            System.out.println("[w] Up / [s] Down / [d] right / [a] left / [f] end game");
            interaccionJugador = sc.nextLine();
            if(interaccionJugador.equals("w")) {jugadorfila = jugadorfila - 1;}
            else if(interaccionJugador.equals("s")){jugadorfila = jugadorfila + 1;}
            else if(interaccionJugador.equals("d")){jugadorColumna = jugadorColumna + 1;}
            else if(interaccionJugador.equals("a")){jugadorColumna = jugadorColumna - 1;}
            else if(interaccionJugador.equals("f")){System.out.println("Game Over"); jugar = false;}

            if(jugadorfila == manzanaFila && jugadorColumna == manzanaColumna){
                longitud = longitud + 1;
                manzana = false;
            }
        }

    }
}