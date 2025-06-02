package Basics;

public class PrimeNumber { // This defines a public class named PrimeNumber
    public static void main(String[] args) { // The main method is the entry point of the program

        int num = 13 ; // Declare an integer variable 'num' and initialize it with the value 7
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
            System.out.println(num + " is a prime number"); // Print "num is a prime number"
        } else {
            System.out.println("Not Prime"); // Otherwise, print "Not Prime"
        }
    }
}

//Explanation:



//This code checks whether a given number is a prime number by using a loop that runs from 1 to the value of `num`. Inside the loop, it checks how many numbers divide `num` exactly (i.e., with no remainder). For example, when `i` is 1, `num % i == 0`, so the count is incremented by 1. As the loop continues, the count only increases again when `i` equals `num` itself (since a number is always divisible by itself). If, after the loop, the total count of divisors is exactly 2, meaning the number is divisible only by 1 and itself — the program concludes that it is a prime number. Otherwise, it's not prime.
