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

        // We cannot reverse the numbers without storing them in reverse that means we
        // will need an array to do it

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // The line creates an array of integers named arr with a size defined by the variable N.
        // If the user inputs 5 for N, for example, this line will create an integer
        // array arr with 5 elements, indexed from arr[0] to arr[4].
        int[] arr = new int[n];

        //This will read 0th index, 1st index, 2nd index, upto n-1 of n. Go over index 0 & read 1 Number from CL
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();  //next integer in line
        }

        //This loop starts from the last index and goes till 0th index
        for(int i = n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
