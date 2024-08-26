package Arrays;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] array = { 1, 14, 6, 8, 19 };

        Arrays.sort(array); // O(nlogn)
        System.out.println(Arrays.toString(array)); //we will have sorted array here

        // Traversal
        System.out.println("Array Length " + array.length); // this will tell that this array has 5 elements

        // When i = 0, arr[i] is arr[0], which gives you 1.
        // When i = 1, arr[i] is arr[1], which gives you 14.
        // This continues until i = 4, where arr[i] is arr[4], which gives you 19.

        //all indeces less than 5
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }


        //Enhanced For Loop/For each Loop
        //for every integer x that is present in this array, x is not the index but the value that is contained in this array
        for(int x: array){
            System.out.println(x);
        }



        int[] arr2 = new int[10];

        // The fill method is gonna fill this array with 12 at each position(index)
        Arrays.fill(arr2, 12);

        // Here we have updated the value of 0th index
        arr2[0] = 10;
        System.out.println(Arrays.toString(arr2));
    }
}
