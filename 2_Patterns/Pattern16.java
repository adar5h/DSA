import java.util.*;

public class Pattern16{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int nsp = 2*n - 3;
     int star = 1;
     
     for(int j = 1; j <= n; j++){
         
         int count = 1;
         
         for(int i = 1; i <= star; i++){
             System.out.print(count + "	");
             count++;
         }
         
         for(int i = 1; i <= nsp; i++){
             System.out.print("	");
         }

        if(j==n){
            count--;
            star--;
        }
         
         for(int i = 1; i <= star; i++){
             count--;
             System.out.print(count + "	");
         }
         
         nsp -= 2;
         star++;
         System.out.println();
     }

 }
}