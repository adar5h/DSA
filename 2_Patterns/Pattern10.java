import java.util.*;

public class Pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here

     int n = scn.nextInt();

    int onsp = n/2;
    int st = 1;
    int insp = -1;

    for(int i = 1; i <= n; i++){

        for(int j = 1; j <= onsp; j++){
            System.out.print("\t");
        }

        for(int j = 1; j <= st; j++){
            System.out.print("*\t");
        }

        for(int j = 1; j <= insp; j++){
            System.out.print("\t");
        }

        if(i!=1 && i!=n){
                System.out.print("*\t");
        }

        if(i<=n/2){
            onsp--;
            insp += 2;
        }else{
            onsp++;
            insp -= 2;
        }

        
        System.out.println();

    }

 }
}