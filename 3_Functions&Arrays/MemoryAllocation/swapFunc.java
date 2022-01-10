package MemoryAllocation;
public class swapFunc {
    
    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
    
        System.out.println(x); //10
        System.out.println(y); //20
    
        swap(x,y); // Values will be passed, not the variables. Therefore, all the changes made will be take place in swap function and won't affect main's values.
    
        System.out.println(x); //10
        System.out.println(y); //20
    }

    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }



}
