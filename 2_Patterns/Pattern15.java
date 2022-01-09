import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int sp = n/2;
        int st = 1; 
        int count = 1;
        int temp = 0;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }

            temp = count;
            
            for(int j = 1; j <= st; j++){
                System.out.print(temp + "\t");

                if(j<=st/2){
                    temp++;
                }else{
                    temp--;
                }
            }

            if(i<n/2+1){
                st+=2;
                sp--;
                count++;
            }else{
                st-=2;
                sp++;
                count--;
            }

            System.out.println();
        }

    }
}