import java.io.*;
import java.util.*;

public class SubArrayProblem{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr =new int[n];
        
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }

    for(int sp = 0; sp < arr.length; sp++){
        for(int ep = sp; ep < arr.length; ep++){

            for(int i = sp; i <= ep; i++){
                System.out.print(arr[i]+"\t");
            }

            System.out.println();
        }
    }
 }

}