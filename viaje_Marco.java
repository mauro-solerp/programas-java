
import java.util.Scanner;

public class viaje_Marco{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        
        // Analizis Marco -------------------------

        double distanciaMarcoMadre = 350;
        double velocidadMarco = 0;        
        double tiempoMarco = 0;         
        double probabilidadClima = 0;
        double probabilidadMonoEscapa = 0;
        double probabilidadMonoSeCansa = 0;
        double probabilidadMarcoEmocion = 0;
        double espacioMarco = 0;
        

        //Analizis Madre -------------------------
        
        double velocidad_de_Madre = 0;    
        double tiempo_de_Madre = 0;       
        double probabilidadClima_Madre = 0; 
        double espacioMadre = 0;

        // Logica programa --------------------

        int var_dia = 0;
        int modoDeBug = 0;
        int siguiente = 1;
        String interaccionJugador ="";
        int distanciaParaDibujo;
        

        System.out.println("Activar modo deBug?");
        modoDeBug = sc.nextInt();
        

        while (siguiente == 1 && distanciaMarcoMadre > 0 ){  
            System.out.println("Presiona para continuar ");
            interaccionJugador = sc.nextLine();

            // Probabilidades -> Marco <-

            velocidadMarco = (Math.random()*(15-10))+10;    //Se define el valor entre 10 y 15 
            tiempoMarco = (Math.random()*(10-8))+8;         //Se define el valor entre 8 y 10
            probabilidadClima = (Math.random()*100);
            probabilidadMonoEscapa = (Math.random()*100);
            probabilidadMonoSeCansa= (Math.random()*100);
            probabilidadMarcoEmocion= (Math.random()*100);

            // Probabilidades -> Madre <-

            velocidad_de_Madre = (Math.random()*(9-6))+6;   //Se define el valor entre 9 y 6 
            tiempo_de_Madre = (Math.random()*(10-8))+8;     //Se define el valor entre 8 y 10
            probabilidadClima_Madre = (Math.random()*100);
            
            
            //impresion de pantalla del modoDebug -- solo cuando esta activado 

            if (modoDeBug == 1){ 

                System.out.println("_________________________________________________"         );
                System.out.println(""                                                          );
                System.out.println(" // Velocidad Marco " + velocidadMarco + " km/h "          );
                System.out.println(" // Tiempo Marco " + tiempoMarco + " horas "               );
                System.out.println(" // Probabilidad Clima " + probabilidadClima               );
                System.out.println(" // Probabilidad Mono Se escapa " + probabilidadMonoEscapa );
                System.out.println(" // Probabilidad Mono Se cansa " + probabilidadMonoSeCansa );
                System.out.println("_________________________________________________"         );
            }

            

            // IF Clima (Marco)

            System.out.println("**********************************************");
            System.out.println("|                 +-------+"            );
            System.out.println("|                 |Dia = " + var_dia + "|"  );
            System.out.println("|                 +-------+"            );

            System.out.println("| - - - - - - - - - - - - - - - - - - - - - -");

            if (probabilidadClima < 10 ){
                System.out.println("|  -->Lluvia fuerte (Marco)");
                velocidadMarco = velocidadMarco * 0.25;
            }
            else if (probabilidadClima < 30 ){
                System.out.println("|  --> Lluvia normal (Marco)");
                velocidadMarco = velocidadMarco * 0.75;
            }
            else{
                System.out.println("|  --> Buen clima (Marco)");
            }

            // IF Mono (Marco)

            if (probabilidadMonoEscapa < 15  &&  probabilidadMonoSeCansa < 35){
                System.out.println("|  --> El mono se ha cansado y se escapo");
                velocidadMarco = velocidadMarco * 0.90;
                tiempoMarco = tiempoMarco - 2; 
            }
            else if(probabilidadMonoEscapa < 15  ){
                System.out.println("|  --> El mono se escapo");
                tiempoMarco = tiempoMarco - 2; 
            }
            else if(probabilidadMonoSeCansa < 25) {
                System.out.println("|  --> El mono se canso");
                velocidadMarco = velocidadMarco * 0.90;
            }

            // IF Clima (Madre)

            if (probabilidadClima_Madre < 10 ){
                System.out.println("|  -->Lluvia fuerte (madre)");
                velocidad_de_Madre = velocidad_de_Madre * 0.25;
            }
            else if ( probabilidadClima_Madre < 30 ){
                System.out.println("|  --> Lluvia normal (madre)");
                velocidad_de_Madre = velocidad_de_Madre * 0.75;
            }
            else{
                System.out.println("|  --> Buen clima (madre)");
            }

            //Concluciones dia 

            if(distanciaMarcoMadre <= 0){
                siguiente = 0;
                System.out.println("|  --> Marco ha encontrado a su madre!!!");
            }
            else if(distanciaMarcoMadre < 50){
                if (probabilidadMarcoEmocion < 50){
                    System.out.println("|  --> A Marco le dicen que han visto a su madre!!");
                    espacioMarco = espacioMarco + 25;
                    if(distanciaMarcoMadre <= 0){
                        siguiente = 0;
                        System.out.println("|  --> Marco ha encontrado a su madre!!!");
                    }
                    else{
                        siguiente = 1;
                        var_dia = var_dia + 1;
                    }
                    
                    
                
                }
                else{
                    var_dia = var_dia + 1;
                    siguiente = 1;
                }
            }
            else{
                var_dia = var_dia + 1;
                siguiente = 1;

            }
            System.out.println("| - - - - - - - - - - - - - - - - - - - - - -");


            //impresion pantalla progreso del dia
   
            espacioMarco = velocidadMarco * tiempoMarco;
            espacioMadre = velocidad_de_Madre * tiempo_de_Madre;
            distanciaMarcoMadre = ((distanciaMarcoMadre + espacioMadre) - espacioMarco );
            distanciaParaDibujo = (int) distanciaMarcoMadre;
           
            
            System.out.println("| Velocidad Marco = " + velocidadMarco + " km/h " ); 
            System.out.println("| Tiempo Marco =  " + tiempoMarco + " horas     " ); 
            System.out.println("| Recorrido = " + espacioMarco + " Km           " );
            System.out.println("| distancia  = " + distanciaMarcoMadre + " Km  "  );
            System.out.println("**********************************************"   );
            System.out.println("|       +---------------------------+"         );
            System.out.println("|       |Distancia Marco de la Madre|"         );
            System.out.println("|       +---------------------------+"         );

            System.out.println("| - - - - - - - - - - - - - - - - - - - - - -"   );
            if(distanciaMarcoMadre>0){
                System.out.print("|   m");
                for (int i=0;i<distanciaParaDibujo;i=i+10){
                    
                    System.out.print("_");
                    
                }
                System.out.println("M");
            }
            else if(distanciaMarcoMadre<= 0){
                System.out.println("|");
                System.out.println("|       MARCO ENCONTRO A SU MADRE!!!      ");
            }
            System.out.println("|");
           
            System.out.println("**********************************************"   );





            
        }
    }
}