import java.util.*;
  
  public class PythagoreanTriplet{
  
  public static void main(String[] args) {
    // write your code here  

    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();

    if((a*a)+(b*b)==(c*c) || (c*c)+(b*b)==(a*a) || (c*c)+(a*a)==(b*b)){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
 

   }
  }