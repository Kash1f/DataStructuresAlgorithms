package Arrays;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] arr = { 1, 14, 6, 8, 19 };

        Arrays.sort(arr); // O(nlogn)
        System.out.println(Arrays.toString(arr));

        // Traversal
        System.out.println("Array Length" + arr.length); // this will tell that this array has 5 elements

        // When i = 0, arr[i] is arr[0], which gives you 1.
        // When i = 1, arr[i] is arr[1], which gives you 14.
        // This continues until i = 4, where arr[i] is arr[4], which gives you 19.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr2 = new int[10];

        // The fill method is gonna fill this array with 12 at each position(index)
        Arrays.fill(arr2, 12);

        // Here we have updated the value of 0th index
        arr2[0] = 10;
        System.out.println(Arrays.toString(arr2));
    }
}
