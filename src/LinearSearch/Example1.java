package LinearSearch;

public class Example1 {
    public static void main(String[] args) {
       int [] nums = {30, 44, 65, 8, 19, 98, 28};
       int target = 98;
       int ans = linearSearch(nums, target);
       System.out.println(ans);
    }

    //search in the array: return the index if item found
    //otherwise if item is not found then return -1

     static int linearSearch(int[] nums, int target){
        if (nums.length == 0){
            return -1;
     }

     // run a for loop
     for(int index = 0; index < nums.length; index++){
        //check for element at every index
        int element = nums[index];
        if(element == target){
            return index;
        }
     }

     //this line will execute if none of the return statements above have executed hence
     // the target not found
        return -1;
}}
