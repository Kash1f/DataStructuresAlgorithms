package Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        // Initialize an array with some integers
        int a[] = {50, 30, 40, 20, 100};

        // Initialize max and secondMax to the smallest possible integer value
        // This ensures that any value in the array will be larger than these initial values
        int max = Integer.MIN_VALUE; // This will store the maximum value found
        int secondMax = Integer.MIN_VALUE; // This will store the second maximum value found

        // Loop through each element in the array
        for (int i = 0; i < a.length; i++) {
            // Check if the current element is greater than the current max
            if (a[i] > max) {
                // Before updating max, assign the current max value to secondMax
                // This is because the current max will become the second maximum
                secondMax = max; // Update secondMax to the previous max
                max = a[i]; // Update max to the current element
            } 
            // Check if the current element is greater than secondMax but not equal to max
            
            
            else if (a[i] > secondMax && a[i] != max) {
                // Update secondMax to the current element if it's greater than secondMax
                secondMax = a[i]; // Update secondMax to the current element
            }
        }

        // Print the maximum value found in the array
        System.out.println("Max value: " + max);
        // Print the second maximum value found in the array
        // If secondMax is still Integer.MIN_VALUE, it indicates that there was no valid second maximum
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second Max value: Not found (all elements may be equal)");
        } else {
            System.out.println("Second Max value: " + secondMax);
        }
    }
}
