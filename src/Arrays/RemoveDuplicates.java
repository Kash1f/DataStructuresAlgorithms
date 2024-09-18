package Arrays;

import java.util.Arrays;



public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};  // Example array

        Arrays.sort(arr);  // Sort the array

        int[] temp = new int[arr.length];
        int j = 0;

        // Traverse the sorted array and store unique elements in temp array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[arr.length - 1]; // Add the last element

        // Print unique elements
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

