package Arrays;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] arr ={1,4,6,8,9};
        
        System.out.println(Arrays.toString(arr));



        int[] arr2 = new int[10];

        //The fill method is gonna fill this array with 12 at each position(index)
        Arrays.fill(arr2, 12);

        //Here we have updated the value of 0th index
        arr2[0] = 10;
        System.out.println(Arrays.toString(arr2));
    }
}
