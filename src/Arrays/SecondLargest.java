package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 12};  // Example array

        // Initialize two variables to find the largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                // Update second largest before updating largest
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                // Update second largest if arr[i] is smaller than largest but larger than second largest
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}