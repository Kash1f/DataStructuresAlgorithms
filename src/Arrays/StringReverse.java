package Arrays;

public class StringReverse {
    public static void main(String[] args) {

        // Define a string and print it in reverse

        // Instead of taking user input, we will directly define a string in the code.
        String input = "reverse";  // The string to be reversed

        // Convert the input string into a character array
        // This will create an array of characters from the input string.
        // For the string "hello", this will create the character array ['h', 'e', 'l', 'l', 'o'].
        char[] charArray = input.toCharArray();

        // Now, we can reverse the string by iterating the array from the last index.
        // Let's use a loop to reverse the array.

        // Loop to print the string in reverse
        // We start from the last character (charArray.length - 1) and move towards the first one (index 0).
        for(int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);  // This will print each character in reverse order
        }
    }
}
