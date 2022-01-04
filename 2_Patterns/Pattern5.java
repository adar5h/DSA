import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int nsp = n/2;
        int nst = 1;

        for(int st = 0; st < n; st++){

            for(int i = 0; i < nsp; i++){
                System.out.print("\t");
            }
            
            for(int i = 0; i < nst; i++){
                System.out.print("*\t");
            }

            if(st<n/2){
                nsp--;
                nst += 2;
            }else{
                nsp++;
                nst -= 2;
            }
            System.out.println();

        }

    }
}