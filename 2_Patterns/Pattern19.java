import java.util.*;

public class Pattern19{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here

     int n = scn.nextInt();

     for(int i = 1; i <= n; i++){
         for(int j = 1; j <= n; j++){
             if(i == n/2+1 || j == n/2+1 || (i == 1 && (j<=n/2+1 || j>=n)) || (i == n && (j==1 || j>=n/2+1)) || (j==n && (i<=n/2+1 || i>n) || (j==1 && (i>=n/2+1 || i==1)))){
                 System.out.print("*\t");
             }else{
                 System.out.print("\t");
             }
         }
         System.out.println();
     }

 }
}