import java.io.*;
import java.util.*;

public class DiffOfArrays{

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int [] arr1 = new int[n1];
    for(int i = 0; i < arr1.length; i++){
        arr1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int [] arr2 = new int[n2];
    for(int i = 0; i < arr2.length; i++){
        arr2[i] = scn.nextInt();
    }

    int n3 = Math.max(n1,n2);
    int[] ans = new int[n3];

    int i = n1-1;
    int j = n2-1;
    int k = n3-1;
    int borrow = 0;

    while(k>=0){
        int tobeSubt;

        if(i>=0){
            tobeSubt = arr1[i];
        }else{
            tobeSubt = 0;
        }

        if(arr2[j] + borrow >= tobeSubt){
            ans[k] = arr2[j] + borrow - tobeSubt;
            borrow = 0;
        }else{
            ans[k] = arr2[j] + borrow + 10 - tobeSubt;
            borrow = -1;
        }

        i--;
        j--;
        k--;
    }

    
    int idx = 0;
    while(ans[idx]==0){ // Ignoring the unconsiderable zeroes
        idx++;
    }

    while(idx < n3){
        System.out.println(ans[idx]);
        idx++;
    }
 }

}