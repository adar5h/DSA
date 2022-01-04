import java.util.*;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n = scn.nextInt();

        int prev = 0;
        int curr = 1;

        for(int i = 0; i < n; i++){

            for(int j = 0; j <= i; j++){
                System.out.print(prev+"\t");
                int next = prev + curr;
                prev = curr;
                curr = next;
            }

            System.out.println();
        }

    }
}