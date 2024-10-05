package Arrays;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        //Check the Equality of Two Arrays - Basic Approach

        // int array1[] = {1,2,3,4,5};
        // int array2[] = {1,2,3,4,5};

        // if(Arrays.equals(array1, array2)){
        //     System.out.println("Arrays are Equal");
            
        // } else {
        //     System.out.println("Arrays are not Equal");
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
    }
}
