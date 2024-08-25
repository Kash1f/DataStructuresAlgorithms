package Arrays;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] arr ={1,4,6,8,9};
        
        System.out.println(Arrays.toString(arr));



        int[] arr2 = new int[10];
        Arrays.fill(arr2, 12);
        arr2[0] = 10;
        System.out.println(Arrays.toString(arr2));
    }
}
