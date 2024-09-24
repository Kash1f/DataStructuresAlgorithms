package Arrays;

import java.util.Arrays;

public class ResizeArray{
    public static void main(String[] args) {
        // Initial array with 5 elements
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // New size of the array
        int newSize = 8;

        // Resizing the array
        int[] resizedArray = resizeArray(originalArray, newSize);
        System.out.println("Resized Array: " + Arrays.toString(resizedArray));
    }

    // Method to resize an array
    public static int[] resizeArray(int[] originalArray, int newSize) {
        // Create a new array with the desired size
        int[] newArray = new int[newSize];
        
        // Copy elements from original array to new array
        for (int i = 0; i < originalArray.length && i < newSize; i++) {
            newArray[i] = originalArray[i];
        }
        
        return newArray;
    }
}
