package MemoryAllocation;

public class swapInArrayFunc {

    public static void main(String[] args) {
        
        int[] arr = {10,20};

        System.out.println(arr[0]); //10
        System.out.println(arr[1]); //20

        swap(arr[0],arr[1]); // Values will be passed. Array's address will be in main, but actual array would be in heap. 
        // As the function itself is in the main, there will be changes in the function, not in the heap which takes refernce address from main.
        // Thus no change will take place.
        System.out.println(arr[0]); //10
        System.out.println(arr[1]); //20
    }

    public static void swap(int x, int y){ // This function will be formed in main
        int temp = x; 
        x = y; 
        y = temp;
    }
    
}
