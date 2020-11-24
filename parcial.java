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
        int tiempoDia;
        int articulos_vendidos;
        int personas_atendidas;
        String finalizar;

        personas = 0;
        personas_atendidas = 0;
        articulos_vendidos = 0;
        caja1 = 0;
        caja2 = 0;
        caja3 = 0;
        caja4 = 0;
        tiempoDeEspera1 = 0;
        tiempoDeEspera2 = 0;
        tiempoDeEspera3 = 0;
        tiempoDeEspera4 = 0;
        tiempoDia= 720;

        finalizar = "f";
        


        tiempo = 0;
        cola = 0;
        personas = 0;


        for (int i = 0; i <= tiempoDia; i++){

            System.out.println("Presiona para continuar ");
            interaccion = sc.nextLine();
            
            if(finalizar.equals(interaccion)) {
                System.out.println("foefje");
            }

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

                if (caja1 == 0 && cola > 0 ){

                    caja1 = caja1 + 1;
                    cola = cola -1;
                    probabilidad_articulos = (int)(Math.random()*(15-5))+5;
                    tiempoDeEspera1 = probabilidad_articulos;
                    articulos_vendidos = articulos_vendidos + probabilidad_articulos;
                    personas_atendidas = personas_atendidas + 1;

                }

                // Sistema caja 2

                if(caja2 == 0 && cola > 0){
                    caja2 = caja2 + 1;
                    cola = cola -1;
                    probabilidad_articulos = (int)(Math.random()*(15-5))+5;
                    tiempoDeEspera2 = probabilidad_articulos;
                    articulos_vendidos = articulos_vendidos + probabilidad_articulos;
                    personas_atendidas = personas_atendidas + 1;
                    
                }

                //Sistema caja 3

                if(caja3 == 0 && cola > 0){
                    caja3 = caja3 + 1;
                    cola = cola -1;
                    probabilidad_articulos = (int)(Math.random()*(15-5))+5;
                    tiempoDeEspera3 = probabilidad_articulos;
                    articulos_vendidos = articulos_vendidos + probabilidad_articulos;
                    personas_atendidas = personas_atendidas + 1;
                }

                //Sistema caja 4

                if(caja4 == 0 && cola > 0){
                    caja4 = caja4 + 1;
                    cola = cola -1;
                    probabilidad_articulos = (int)(Math.random()*(15-5))+5;
                    tiempoDeEspera4 = probabilidad_articulos;
                    articulos_vendidos = articulos_vendidos + probabilidad_articulos;
                    personas_atendidas = personas_atendidas + 1;
                    
                }
                if (tiempoDeEspera1 > 0){
                tiempoDeEspera1 = tiempoDeEspera1 -1;
                }
                else{
                    caja1 = 0;
                }

                if (tiempoDeEspera2 > 0){
                    tiempoDeEspera2 = tiempoDeEspera2 -1;
                }
                else{
                    caja2 = 0;
                }

                if (tiempoDeEspera3 > 0){
                    tiempoDeEspera3 = tiempoDeEspera3 -1;
                }
                else{
                    caja3 = 0;
                }
                 if (tiempoDeEspera4 > 0){
                    tiempoDeEspera4 = tiempoDeEspera4 -1;
                }
                else{
                    caja4 = 0;
                }

            }
            System.out.println("Minuto " + i + " -Llega " + personas + " -En cola: " + cola);
            System.out.print("caja1 : [" + tiempoDeEspera1 + "] | " );
            System.out.print("caja2 : [" + tiempoDeEspera2 + "] | " );
            System.out.print("caja3 : [" + tiempoDeEspera3 + "] | " );
            System.out.println("caja4 : [" + tiempoDeEspera4 + "] | " );
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            if(i == 720){
                System.out.println("_________________________________________");
                System.out.println("");
                System.out.println("                 RESUMEN                 ");
                System.out.println("=========================================");
                System.out.println(" - Personas en la cola al cierre : " + cola);
                System.out.println(" - Personas atendidas en el dia : " + personas_atendidas);
                System.out.println(" - Artuculos vendidos en el dia : " + articulos_vendidos);
                System.out.println("=========================================");
            }
   
        }

    }

}