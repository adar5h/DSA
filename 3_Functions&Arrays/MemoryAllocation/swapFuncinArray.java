package MemoryAllocation;

public class swapFuncinArray {

    public static void main(String[] args) {
        
        int[] arr = {10,20};

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int temp = arr[0]; // Temp is being made in stack, while arr is in heap and all the changes are being made in heap. Therefore, changes show affect.
        arr[0] = arr[1]; 
        arr[1] = temp;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
    
}
