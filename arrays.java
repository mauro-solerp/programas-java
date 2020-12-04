
import java.util.Scanner;

public class arrays{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int opcionUsuario;
        boolean salirMenu;
    

        salirMenu=false;

        do{

            System.out.println("MENU DE OPCIONES");
            System.out.println("----------------");
            System.out.println("1 - Opcion 1 ");
            System.out.println("2 - Opcion 2 ");
            System.out.println("3 - Opcion 3 ");
            System.out.println("4 - Opcion 4 ");
            System.out.println("5 - Salir");
            System.out.println("----------------");
            System.out.println("Seleccione una opcion");
            opcionUsuario = sc.nextInt();


            if(opcionUsuario == 1){
                System.out.println("Opcion 1");
            }else if(opcionUsuario == 2){
                System.out.println("Opcion 2");

            }else if(opcionUsuario == 3){
                System.out.println("Opcion 3");
            }else if(opcionUsuario == 4){
                System.out.println("Opcion 4");
            }else if(opcionUsuario == 5){
                salirMenu = true;
            }else{
                System.out.println("Opcion invalida");
            }

         

        } while(salirMenu == false);


    }
}