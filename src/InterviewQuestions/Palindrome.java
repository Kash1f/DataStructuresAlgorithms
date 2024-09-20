package InterviewQuestions;

// Import the Scanner class to take user input
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a word or number
        System.out.print("Enter a word or number: ");
        String input = scanner.nextLine(); // Read the user's input as a string
        
        // Convert the input to lowercase to ignore case sensitivity (e.g., 'Madam' and 'madam' will be the same)
        String original = input.toLowerCase();
        
        // Create an empty string to store the reverse of the original input
        String reverse = "";
        
        // Loop through the original string in reverse order
        // 'i' starts at the last character (original.length() - 1) and moves to the first (i >= 0)
        for (int i = original.length() - 1; i >= 0; i--) {
            // Add each character from the end of the original string to the 'reverse' string
            reverse = reverse + original.charAt(i); 
        }
        
        // Check if the original string (in lowercase) is the same as the reversed string
        if (original.equals(reverse)) {
            // If they are equal, the input is a palindrome
            System.out.println(input + " is a palindrome.");
        } else {
            // If not, the input is not a palindrome
            System.out.println(input + " is not a palindrome.");
        }
        
        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}
