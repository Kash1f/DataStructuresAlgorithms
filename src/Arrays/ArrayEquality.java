package Arrays;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        // Check the Equality of Two Arrays - Basic Approach

        // int array1[] = {1,2,3,4,5};
        // int array2[] = {1,2,3,4,5};

        // if(Arrays.equals(array1, array2)){
        // System.out.println("Arrays are Equal");

        // } else {
        // System.out.println("Arrays are not Equal");
        // }

        //Check the Equality of Two Arrays - Basic Approach No 2

        int array1[] = {1,2,3,4,5};
        int array2[] = {1,2,3,4,5};

        boolean status = Arrays.equals(array1, array2);

        if(status == true){
        System.out.println("Arrays are Equal");
        } else {
        System.out.println("Arrays are not equal");
        }

        //Check the Equality of Two Arrays - Approach without Arrays.equal Method

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 4, 5 };

        boolean status2 = true;

        //Check if the lengths of the arrays are equal
        if(arr1.length == arr2.length) {
            //Compare each element of both arrays
            for(int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]) {
                    status2 = false; //If any element differs, set status to false
                    break; //No need to check further if a mismatch is found
                }
            }
        } else {
            status2 = false; // If lengths are not equal, they are not the same
        }

        // Print the result
        if(status2) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }


        }

    }
