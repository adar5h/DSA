import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int nst = n/2+1;
        int nsp = 1;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < nst; j++){
                System.out.print("*\t");
            }

            for(int j = 0; j < nsp; j++){
                System.out.print("\t");
            }

            for(int j = 0; j < nst; j++){
                System.out.print("*\t");
            }

            if(i<n/2){
                nsp+=2;
                nst--;
            }else{
                nsp-=2;
                nst++;
            }

            System.out.println();
        }

    }
}