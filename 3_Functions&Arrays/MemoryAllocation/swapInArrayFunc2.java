package MemoryAllocation;

public class swapInArrayFunc2 {

    public static void main(String[] args) {
        
        int[] arr = {10,20}; // arr will be on 4k location in main, actual array will be on the heap.

        System.out.println(arr[0]); //10
        System.out.println(arr[1]); //20

        swap(arr); // 4k will be passed(same as that of arr), thus changes made will take place.

        System.out.println(arr[0]); //20
        System.out.println(arr[1]); //10
    }

    public static void swap(int[] arr){ // This function will be formed in main
        int temp = arr[0]; 
        arr[0] = arr[1]; 
        arr[1] = temp;
    }
    
}
