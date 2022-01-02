import java.util.*;

public class rotateANo{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n;
        int nod = 0;

        while(temp>0){
            temp = temp/10;
            nod++;
        }

        k = k%nod; // To reduce the no.

        if(k < 0){ // To tackle -ve no.
            k += nod;
        }

        int k10 = 1;
        int nodKm10 = 1;

        // Calculating powers with Math.pow
        for(int i = 0; i < nod; i++){
            if(i < k){
                k10 *= 10;
            }else{
                nodKm10 *= 10;
            }
        }

        int rem = n % k10;
        int quo = n / k10;
        int ans = (rem * nodKm10) + quo;

        System.out.println(ans);


    }
}