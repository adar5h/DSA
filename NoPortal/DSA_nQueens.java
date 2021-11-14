public class DSA_nQueens{ //Without Safety check
// Just to get the no. of combinations for N no. of queens.

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        nQueens(0,0,"",0,N);
    }

    public static void nQueens(int r, int c, String psf, int qpsf, int N){
        if(c==N){ //Acting reactively
            r = r + 1;
            c = 0;
        }

        if(r==N){ //Base Case
            if(qpsf==N){
                System.out.println(psf);
            }
            return;
        }


        //Yes
        nQueens(r, c+1, psf+ r + c + "-", qpsf+1, N);

        //No 
        nQueens(r, c+1, psf, qpsf, N);
    }


}