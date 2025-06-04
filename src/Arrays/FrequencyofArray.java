package Arrays;

class FrequencyofArray {
    public static void main(String[] args) {

        // Input array with duplicate values
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3, 5};
        int n = arr.length; // Length of the array

        // A boolean array to keep track of already counted elements
        // If visited[i] is true, we skip arr[i] in the outer loop
        boolean[] visited = new boolean[n];

        System.out.println("Frequency of elements:");

        // Outer loop to go through each element in the array
        for (int i = 0; i < n; i++) {

            // If the current element is already counted in a previous iteration, skip it
            if (visited[i])
                continue;

            // Initialize count as 1 because we are already on arr[i]
            int count = 1;

            // Inner loop starts from i+1 to compare arr[i] with the rest of the elements
            for (int j = i + 1; j < n; j++) {

                // If a duplicate is found
                if (arr[i] == arr[j]) {
                    count++;             // Increase the count
                    visited[j] = true;   // Mark arr[j] as visited so it's not counted again
                }
            }

            // After checking all duplicates of arr[i], print its frequency
            System.out.println(arr[i] + " --> " + count);
        }
    }
}
