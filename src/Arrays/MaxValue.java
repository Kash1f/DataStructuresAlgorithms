package Arrays;

import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 4, 24, 10, 30};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
   
}
