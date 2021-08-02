import java.util.*;

pulbic class rotateANo{

    public static void main(String[] args) {
        
        Scanner scn = new int(System.in);

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

        int rpow = 1;
        int remp = 1;

        



    }
}