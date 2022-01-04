import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        // for(int i = 0; i < n; i++){

        //     for(int j = 0; j < n; j++){
        //         if(i==j || i+j==n-1){
        //             System.out.print("*\t");
        //         }else{
        //             System.out.print("\t");
        //         }

        //     }
        //         System.out.println();
        // }

        int nst = 1;
        int nsp = n-2; // IMPORTANT
        int pnsp = 0;

        for(int i = 1; i <= n; i++){
            // System.out.println(i+" "+nsp+" "+pnsp);
            for(int j = 1; j <= pnsp; j++){ // pre-spaces
                System.out.print("\t");
            }

            // for(int j = 1; j <= nst; j++){ // starting star
            //     System.out.print("*\t");
            // }
            System.out.print("*\t");

            for(int j = 1; j <= nsp; j++){  // inner space
                System.out.print("\t");
            }

            if(i!=n/2+1){          // middle row
                // for(int j = 1; j <= nst; j++){
                //     System.out.print("*\t");
                // }
                System.out.print('*');
            }


            if(i<=n/2){
                nsp-=2;
                pnsp++;
            }else{
                nsp+=2;
                pnsp--;
            }

            System.out.println();
        }

    }
}