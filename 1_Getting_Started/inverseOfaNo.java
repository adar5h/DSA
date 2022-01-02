import java.util.*;

public class inverseOfaNo {
    
    public static void main(String[] args) {
        // write your code here  
      
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
      
        int nod = 0;
        int temp = n;
      
        while(temp>10){
          temp = temp/10;
          nod++;
        }
      
        // 2134 -> 1243
        // 4321    4321 
      
        int oidx = 1;
        int iidx = nod;
        int idig = 0;
      
        while(n!=0){
          int odig = n%10;
          n = n/10; 
          idig += oidx * (int)Math.pow(10,odig-1);
          oidx++;
        }
      
        System.out.println(idig);
      
       }
}
