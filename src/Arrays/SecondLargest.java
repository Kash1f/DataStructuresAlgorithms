package Arrays;

public class SecondLargest {

    static int secondLargest(int[] a) {
        if (a.length < 2) {
            return -1; //not enough elements
        }

        int max1, max2;

        //initialize max1 and max2 based on first two elements
        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }

        //traverse the rest of the array starting from index 2
        for (int i = 2; i < a.length; i++) {
            if (a[i] > max1) {
                // New largest found, shift max1 to max2
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2 && a[i] != max1) {
                //new second largest found (and it's not equal to max1)
                max2 = a[i];
            }
        }

        return max2;
    }

    public static void main(String[] args) {
        //test cases
        int[] arr1 = { 12, 35, 1, 10, 34, 1 };
        int[] arr2 = { 10, 5, 10 };
        int[] arr3 = { 10, 10, 10 };

        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Second largest: " + secondLargest(arr1));

        System.out.println("\nArray 2: " + java.util.Arrays.toString(arr2));
        System.out.println("Second largest: " + secondLargest(arr2));

        System.out.println("\nArray 3: " + java.util.Arrays.toString(arr3));
        System.out.println("Second largest: " + secondLargest(arr3));
    }
}
