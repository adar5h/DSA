package MemoryAllocation;

public class swapWithoutFunc {

    public static void main(String[] args) {
        
        // Without third variable

        int x = 10;
        int y = 20;
    
        System.out.println(x);
        System.out.println(y);
    
        x = x+y; //30
        y = x-y; //10
        x = x - y; //20
    
        System.out.println(x); 
        System.out.println(y);
    }
    
}
