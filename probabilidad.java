
public class probabilidad {
    public static void main (String [] args){

        int probabilidad = (int) (Math.random()*100);

        System.out.println(probabilidad);

        if (probabilidad < 20){
            System.out.println("No llueve");
        }
        else if (probabilidad > 20 && probabilidad< 70 ){
            System.out.println("Llovisna");
        }
        else{
            System.out.println("LLuvia furte");
        }


    }
}