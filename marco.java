public class marco{
    public static void main (String [] args){

        int probabilidad_cansancio = (int) (Math.random()*100);
        int probabilidad_escapar = (int) (Math.random()*100);

        if (probabilidad_escapar >= 70 && probabilidad_cansancio >=70){
            System.out.println("El mono se ha cansado y se escapo");
        }
        else if(probabilidad_escapar >= 70 ){
            System.out.println("El mono se escapo");
        }
        else if(probabilidad_cansancio >= 70){
            System.out.println("El mono se canso");
        }
        else{
            System.out.println("El camino sigue... ");
        }

        System.out.println("las probabilidades fueron : cansancio = " + probabilidad_cansancio + " escapar = " + probabilidad_escapar);

    }
}