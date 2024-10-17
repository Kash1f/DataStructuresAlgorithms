package InterviewQuestions;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return the indices that sum up to the target
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution"); // If no solution is found
    }
}
