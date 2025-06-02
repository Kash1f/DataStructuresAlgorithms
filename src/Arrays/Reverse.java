package Arrays;

// import java.util.Arrays;
import java.util.Scanner;

// public class Reverse {
//     public static void main(String[] args) {
//         int arr[] = {1, 4, 66, 88, 22};
//         // swap(arr, 1, 4);
//         reverse(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void reverse(int[] arr){
//         int start = 0;
//         int end = arr.length-1;

//         while (start < end){
//             //swap
//             swap(arr, start, end);
//             start++;
//             end--;
//         }
//     }

//     static void swap(int arr[], int index1, int index2){
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }
// }

public class Reverse {

    public static void main(String[] args) {

        // Define a normal array
        int[] arr = { 10, 5, 3, 1, 4 };

        // Print the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }
    }
}
