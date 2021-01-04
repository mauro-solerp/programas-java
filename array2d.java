
import java.util.Scanner;

public class array2d{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        String[][] a = {
            {"[1 ]","[2 ]","[3 ]",},
            {"[4 ]","[5 ]","[6 ]",},
            {"[7] ","[8 ]","[9 ]",},
            {"[10]","[11]","[12]",},
            {"[13]","[14]","[15]",},
            {"[16]","[17]","[18]",},
            {"[19]","[20]","[21]",}

        };


        for(int i = 0; i<a.length; i++){
            
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.print(" ");
        }

    }
}