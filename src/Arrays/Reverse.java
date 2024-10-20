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

        // Read N numbers and Print them in Reverse

        // We cannot reverse the numbers without storing them that means we will need an
        // array to do it
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // The line creates an array of integers named arr with a size defined by the
        // variable N.
        // If the user inputs 5 for N, for example, this line will create an integer
        // array arr with 5 elements, indexed from arr[0] to arr[4].
        // Jo bhi user input dega to us input k hisab se new array create hojaigi, means
        // array will be equal to size of input
        int[] arr = new int[N];

        // 2. Reading the Array
        // This will read 0th index, 1st index, 2nd index, upto n-1 of n. Go over index
        // 0 & read 1 Number from CL
        for (int i = 0; i < N; i++) {

            // This will get the next integer in line from the CL and the loop will
            // increment once the integer is entered
            arr[i] = sc.nextInt();
        }

        // Ab jab array input agayi hai to run another loop but this time use i-- so
        // that it prints from the last index i.e reverse
        // Reverse the loop that is used above to iterate over the array
        // This loop starts from the last index and goes till 0th index
        for (int i = N - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        int a[] = { 10, 5, 3, 1, 4 };

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}