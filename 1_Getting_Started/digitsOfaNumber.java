import java.util.*;

public class digitsOfaNumber{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pow = 1;

        int temp = n;
        int nod = 0;
        while(temp>=10){
            temp = temp/10;
            nod++;
            pow *= 10;
        }
        //System.out.println(nod);

        while(pow>0){
            int d = n / pow;
            
            System.out.println(d);
            n = n%pow;
            pow /= 10;
        }
    }
}