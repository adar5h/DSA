import java.util.*;

public class tillFibonacci{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int prev = 0;
        int curr = 1;

        for(int i = 1; i <= n; i++){
            System.out.println(prev);
            int no = prev + curr;
            prev = curr;
            curr = no;
        }
    }
}