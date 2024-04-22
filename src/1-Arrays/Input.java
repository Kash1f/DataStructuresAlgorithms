import java.util.Scanner;
import java.util.Arrays;

public class Input{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 25;
        arr[2] = 29;
        arr[3] = 31;
        arr[4] = 39;
        System.out.println(arr[1]);


        //input using for loops

        for (int i = 0; i < arr.length; i++) {

            //so whenever you take a next intger it's going to be stored in arr[i]
            //first arr[0]= take input the value will be 1, then arr[1] = input, arr[2] etc

            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

            //this for loop will print the above 
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        //the first for loop ran and took the input then the 2nd for loop ran and it printed it out

        //for every element in the array, print the element
        // for(int num: arr){ 
        //     System.out.println(num + " "); 
        // //here num represents the element of the array
        // }

        // System.out.println(arr[5]); //index out of bound

    }

}
