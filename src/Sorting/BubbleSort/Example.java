package Sorting.BubbleSort;

public class Example {
    public static void main(String[] args) {

        int nums[] = { 6, 5, 2, 8, 9, 4 };
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.println(num + "");
        }

        for(int i=0; i<size;i++){
            for(int j=0;j<size;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                }
            }

    }
}
