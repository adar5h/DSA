import java.util.*;
  
  public class BenjaminBulbs{
  
  public static void main(String[] args) {
    // write your code here  

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    // for(int i = 1; i*i < n; i++){
    //   System.out.println(i*i);
    // }

    int i = 1;
    while(i*i<=n){
      System.out.println(i*i);
      i++;
    }
    
   }
  }