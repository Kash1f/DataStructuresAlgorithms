package Arrays;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Even Numbers: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

        // This loop will retrieve Each value of array a[] and divide value by 2, here
        // value contains Each element of the array
        for (int value : a) {
            if (value % 2 == 0) {
                System.out.println("Even: " + value);
            } else {
                System.out.println("Odd: " + value);
            }
        }

        System.out.println("Odd Numbers: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }

        // for (int value : a) {
        // if (value % 2 != 0)
        // System.out.println(value); // 2 //4 //6
        // }

    }
}

// Approach 2 : Using Enhanced For Loop to print only even numbers

// else if (a[i] % 2 != 0) {
// System.out.println(a[i]);
// }
