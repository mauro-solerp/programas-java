
import java.util.Scanner;

public class elevador{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        int[][] a = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0},
            {0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,1,1,1},
            {0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,1,1,1},
            {0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,1,1,1},
            {0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,1,1,1},
            {0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,0,0,0}

        };
        int jugadorfila;
        int jugadorColumna;
        int elevadorFila;
        int elevadorColumna;
        int primeraPlantaColumna = 23;
        String interaccionJugador = "";
        boolean jugar = true;
        jugadorfila = 7;
        jugadorColumna = 8;
        elevadorFila = 11;
        elevadorColumna = 0;
        int plantaCeroFila = 11;
        int primeraPlantaFila = 9;
        int segundaPlantaFila = 7;
        int terceraPlantaFila = 5;
        int cuartaPlantaFila = 3;
        int quintaPlantaFila = 1;
        


        
        while(jugar){

            System.out.println("+-------------------------------------------------------+");
            for(int i = 0; i<a.length; i++){  //Fila i
                
                for(int j = 0; j<a[i].length; j++){ //Columna j

                    if(i == jugadorfila && j == jugadorColumna){
                        System.out.print("`0");     
                    } 
                    else if(i == elevadorFila && j == elevadorColumna ){
                        System.out.print("__");
                    }
                    else if(i == plantaCeroFila && j == primeraPlantaColumna){
                        System.out.print("PLANTA 0");
                    }
                    else if(i == primeraPlantaFila && j == primeraPlantaColumna){
                        System.out.print("PLANTA 1");
                    }
                    else if(i == segundaPlantaFila && j == primeraPlantaColumna){
                        System.out.print("PLANTA 2");
                    }
                    else if(i == terceraPlantaFila && j == primeraPlantaColumna){
                        System.out.print("PLANTA 3");
                    }
                    else if(i == cuartaPlantaFila && j == primeraPlantaColumna){
                        System.out.print("PLANTA 4");
                    }
                    else if(i == quintaPlantaFila && j == primeraPlantaColumna){
                        System.out.print("PLANTA 5");
                    }
                    
                    else {
                        if(a[i][j]==1){System.out.print("[]");}
                        else if(a[i][j]==0){System.out.print("  ");}
                        else if(a[i][j]==8){System.out.print("||");}
                        else if(a[i][j]==2){System.out.print("//");}
                    }
                }
                System.out.println(" ");
            }
            System.out.println("+-------------------------------------------------------+");
            System.out.println("[w] Up / [s] Down / [d] right / [a] left / [f] end game");
            interaccionJugador = sc.nextLine();
            if(interaccionJugador.equals("w")) {jugadorfila = jugadorfila - 1;}
            else if(interaccionJugador.equals("s") && ){jugadorfila = jugadorfila + 1;}
            else if(interaccionJugador.equals("d")){jugadorColumna = jugadorColumna + 1;}
            else if(interaccionJugador.equals("a")){jugadorColumna = jugadorColumna - 1;}
            else if(interaccionJugador.equals("f")){System.out.println("Game Over"); jugar = false;}

            if(jugadorfila == elevadorFila && jugadorColumna == elevadorColumna){
                
                elevadorFila = elevadorFila -1;
                jugadorfila = jugadorfila - 1;
                
                

            }

        }

    }
}
