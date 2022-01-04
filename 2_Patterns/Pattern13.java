import java.util.*;
public class Pattern13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here

        int n = scn.nextInt();

        int nst = 1;

        for(int i = 0; i < n; i++){

            /*  <--------  IMPORTANT  ---------->
                a. nCr = (n-1)C(r) + (n-1)C(r-1)
                b. nCr / nC(r-1) = (n - r + 1) / r
                
                We're using (b) in this question.

                nCr = nC(r-1) * [(n-r+1) / r]
                Thus, generating our value from the previous value.
            */

            int val = 1; // 0C0 , 1C0, 2C0, ..


            for(int j = 1; j <= nst; j++){  // 'j' has to be initialized 1 as 0th column is calculated for every row.
                System.out.print(val+"\t");
                int nextVal = (val * (i-j+1))/j;

                val = nextVal;
            }

            nst++;

            System.out.println();
        }

    }
}