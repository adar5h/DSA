import java.util.*;

public class GCDnLCM {
    
    public static void main(String[] args) {
        // write your code here  
  
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
  
            int divisor = n1;
            int dividend = n2;
  
        while(dividend%divisor!=0){
            int rem = dividend % divisor;
            dividend = divisor; 
            divisor = rem;
        }
  
        int gcd = divisor;
  
        int lcm = (n1*n2)/gcd;
  
          System.out.println(gcd);
          System.out.println(lcm);
        
        
       }
}
