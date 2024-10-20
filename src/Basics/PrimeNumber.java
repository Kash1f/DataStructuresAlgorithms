package Basics;

public class PrimeNumber { // This defines a public class named PrimeNumber
    public static void main(String[] args) { // The main method is the entry point of the program

        int num = 7; // Declare an integer variable 'num' and initialize it with the value 7
        int count = 0; // Declare another integer variable 'count' to keep track of how many divisors
                       // 'num' has

        // Loop through all numbers from 1 to 'num'
        for (int i = 1; i <= num; i++) {
            // Check if 'num' is divisible by 'i'
            if (num % i == 0) { // The % operator gives the remainder of the division
                count++; // If 'num' is divisible by 'i', increment the count by 1
            }
        }

        // After the loop, check how many divisors 'num' has
        if (count == 2) { // A prime number has exactly 2 divisors: 1 and itself
            System.out.println("Prime"); // If the count is 2, print "Prime"
        } else {
            System.out.println("Not Prime"); // Otherwise, print "Not Prime"
        }
    }
}
