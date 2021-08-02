import java.util.*;

public class primeTillN{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        while(low <= high){

            int factor = 0;

            for(int div = 2; div*div <= high; div++){
                if(low%div==0){
                    factor++;
                    break;
                }
            }

            if(factor==0){
                System.out.println(low);
            }
            low++;
        }
       
    }
}