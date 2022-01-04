import java.util.*;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int count = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(count++ + "\t");
            }
            System.out.println();
        }

    }
}