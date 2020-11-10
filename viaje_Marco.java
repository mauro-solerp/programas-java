
import java.util.Scanner;

public class viaje_Marco{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        
        // Analizis Marco -------------------------

        int distanciaMarcoMadre; = 350;
        double velocidadMarco;       
        double tiempoMarco;         
        double probabilidadClima;
        double probabilidadMonoEscapa;
        double probabilidadMonoSeCansa;
        double probabilidadMarcoEmocion;
        double espacioMarco;
        

        //Analizis Madre -------------------------
        
        double velocidad_de_Madre;    
        double tiempo_de_Madre;       
        double probabilidadClima_Madre;

        // Logica programa --------------------

        int var_dia = 0;
        int modoDeBug = 0;
        int siguiente = 1;

        System.out.println("Activar modo deBug?");
        modoDeBug = sc.nextInt();
        

        if (modoDeBug == 1){ 
        System.out.println("_________________________________________________"   );
        System.out.println(""                                                    );
        System.out.println(" // Velocidad Marco " + velocidadMarco + " km/h "    );
        System.out.println(" // Tiempo Marco " + tiempoMarco + " horas "         );
        System.out.println(" // Probabilidad Clima " + probabilidadClima         );
        System.out.println(" // Probabilidad Mono Se escapa " + probabilidadClima);
        System.out.println(" // Probabilidad Mono Se cansa " + probabilidadClima );
        System.out.println("_________________________________________________"   );
        }

        while (siguiente == 1 ){  

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

            // IF Clima (Marco)

            if (probabilidadClima < 10 ){
                System.out.println("  -->Lluvia fuerte");
                velocidadMarco = velocidadMarco * 0.25;
            }
            else if (probabilidadClima < 30 ){
                System.out.println("  --> Lluvia normal");
                velocidadMarco = velocidadMarco * 0.75;
            }
            else{
                System.out.println("  --> Buen clima");
            }

            // IF Mono (Marco)

            if (probabilidadMonoEscapa < 15  &&  probabilidadMonoSeCansa < 35){
                System.out.println("  --> El mono se ha cansado y se escapo");
                velocidadMarco = velocidadMarco * 0.90;
                tiempoMarco = tiempoMarco - 2; 
            }
            else if(probabilidadMonoEscapa < 15  ){
                System.out.println("  --> El mono se escapo");
                tiempoMarco = tiempoMarco - 2; 
            }
            else if(probabilidadMonoSeCansa < 25) {
                System.out.println("  --> El mono se canso");
                velocidadMarco = velocidadMarco * 0.90;
            }

            // IF Clima (Madre)

            if (probabilidadClima_Madre < 10 ){
                System.out.println("  -->Lluvia fuerte");
                velocidad_de_Madre = velocidad_de_Madre * 0.25;
            }
            else if ( probabilidadClima_Madre < 30 ){
                System.out.println("  --> Lluvia normal");
                velocidad_de_Madre = velocidad_de_Madre * 0.75;
            }
            else{
                System.out.println("  --> Buen clima");
            }

            //Concluciones dia 
            if(distanciaMarcoMadre <= 0){
                siguiente = 0;
            }
            else if(distanciaMarcoMadre < 50){
                if (probabilidadMarcoEmocion < 50){
                    espacioMarco = espacioMarco + 25;
                    siguiente = 1;
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




            //impresion pantalla progreso del dia

            espacioMarco = velocidadMarco * tiempoMarco;
            System.out.println("*************************************************");
            System.out.println("| Dia = " + var_Dia                               );
            System.out.println("| Velocidad Marco = " + velocidadMarco + " km/h " );
            System.out.println("| Tiempo Marco =  " + tiempoMarco + " horas     " ); 
            System.out.println("| Recorrido = " + espacioMarco + " Km           " );
            System.out.println("*************************************************");



            
        }
    }
}