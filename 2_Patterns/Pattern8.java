import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int nsp = n-1;
        int nst = 1;

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < nsp; j++){
        //         System.out.print("\t");
        //     }
        //     for(int j = 0; j < nst; j++){
        //         System.out.print("*\t");
        //     }
            
        //     nsp--;
        //     System.out.println();
        // }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i+j==n-1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}