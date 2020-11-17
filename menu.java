
import java.util.Scanner;

public class menu{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        int opcionUsiario;
        boolean programState;

        programState = true;

        System.out.println("---------------------------");
        System.out.println("1. Ingresar usuario");
        System.out.println("2. Editar usuario");
        System.out.println("3. Eliminar usuario");
        System.out.println("4. Listar todos los usuarios");
        System.out.println("5 Salir del programa");
        System.out.println("---------------------------");
        System.out.println("Ingrese una opcion");
        opcionUsiario = sc.nextInt();

        do {

            System.out.println("---------------------------");
            System.out.println("1. Ingresar usuario");
            System.out.println("2. Editar usuario");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Listar todos los usuarios");
            System.out.println("5 Salir del programa");
            System.out.println("---------------------------");
            System.out.println("Ingrese una opcion");
            opcionUsiario = sc.nextInt();

            if     (opcionUsiario == 1)     { System.out.println("El usuario ha elegido 1"); }
            else if(opcionUsiario == 2)     { System.out.println("El usuario ha elegido 2"); }
            else if(opcionUsiario == 3)     { System.out.println("El usuario ha elegido 3"); }
            else if(opcionUsiario == 4)     { System.out.println("El usuario ha elegido 4"); }
            else if(opcionUsiario == 5)     { System.out.println("Adios"); programState = false; }
        } 
        while (programState);

        
        



    }
}