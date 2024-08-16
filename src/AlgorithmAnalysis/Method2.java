package AlgorithmAnalysis;

import java.util.Scanner;

public class Method2 {

    // Method to find the sum of first n natural numbers
    public int findSum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        sc.close(); // Close the scanner to avoid resource leaks

        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Method2 obj = new Method2(); // Create an instance of the Method2 class
        int result = obj.findSum();  // Call the findSum method using the instance
        System.out.println("The sum is: " + result);  // Print the result
    }
}
