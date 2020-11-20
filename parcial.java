import java.util.Scanner;

public class parcial{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        // Declaracion variables

        int tiempo;
        int probabilidad_Cola;
        int caja1, caja2, caja3, caja4;
        int personas;
        int probabilidad_articulos;
        int items;
        int cola;
        int tiempoDeEspera1;
        int tiempoDeEspera2;
        int tiempoDeEspera3;
        int tiempoDeEspera4;
        String interaccion;

        personas = 0;
        caja1 = 0;
        caja2 = 0;
        caja3 = 0;
        caja4 = 0;
        tiempoDeEspera1 = 0;
        tiempoDeEspera2 = 0;
        tiempoDeEspera3 = 0;
        tiempoDeEspera4 = 0;
        


        tiempo = 0;
        cola = 0;


        while ( tiempo <= 720){

            personas = 0;

            System.out.println("Presiona para continuar ");
            interaccion = sc.nextLine();

            probabilidad_Cola = (int)(Math.random()*100);

            if (probabilidad_Cola <= 40){
                cola = cola + 1;
                personas = personas + 1;
            }
            else{
                personas = 0;
            } 

            
            if(cola >= 1){

                //Sistema caja 1

                if (caja1 == 0 ){

                    caja1 = caja1 + 1;
                    cola = cola -1;
                    probabilidad_articulos = (int)(Math.random()*(15-5))+5;
                    tiempoDeEspera1 = probabilidad_articulos;
                    

                }

                // Sistema caja 2

                if(caja2 == 0 ){
                    caja2 = caja2 + 1;
                    cola = cola -1;
                    probabilidad_articulos = (int)(Math.random()*(15-5))+5;
                    tiempoDeEspera2 = probabilidad_articulos;
                    
                }

                //Sistema caja 3

                if(caja3 == 0 ){
                    caja3 = caja3 + 1;
                    cola = cola -1;
                    probabilidad_articulos = (int)(Math.random()*(15-5))+5;
                    tiempoDeEspera3 = probabilidad_articulos;
                }

                //Sistema caja4

                if(caja4 == 0 ){
                    caja4 = caja4 + 1;
                    cola = cola -1;
                    probabilidad_articulos = (int)(Math.random()*(15-5))+5;
                    tiempoDeEspera4 = probabilidad_articulos;
                    
                }

            }

            if (tiempoDeEspera1 > 0){
                tiempoDeEspera1 = tiempoDeEspera1 -1;
            }
            else{
                caja1 = caja1 - 1;
            }

            if (tiempoDeEspera2 > 0){
                tiempoDeEspera2 = tiempoDeEspera2 -1;
            }
            else{
                caja2 = caja2 - 1;
            }
           
            if (tiempoDeEspera3 > 0){
                tiempoDeEspera3 = tiempoDeEspera3 -1;
            }
            else{
                caja3 = caja3 - 1;
            }
             if (tiempoDeEspera4 > 0){
                tiempoDeEspera4 = tiempoDeEspera4 -1;
            }
            else{
                caja4 = caja4 - 1;
            }
            
            

            System.out.println("Minuto " + tiempo + " -Llega " + personas + " -En cola: " + cola);
            System.out.print("caja1 : [" + tiempoDeEspera1 + "] | " );
            System.out.print("caja2 : [" + tiempoDeEspera2 + "] | " );
            System.out.print("caja3 : [" + tiempoDeEspera3 + "] | " );
            System.out.println("caja4 : [" + tiempoDeEspera4 + "] | " );
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");

            

            tiempo = tiempo +1;


            
            
        }



    }
}