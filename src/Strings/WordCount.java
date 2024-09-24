package Strings;

public class WordCount{
    public static void main(String[] args) {
        // Input string
        String sentence = "This is a simple Java program to count words";
        
        // Calling method to count words
        int wordCount = countWords(sentence);
        
        // Displaying the result
        System.out.println("Number of words: " + wordCount);
    }

    // Method to count words in a string
    public static int countWords(String str) {
        // Trim the string to remove leading and trailing spaces
        // Split the string by one or more spaces
        String[] words = str.trim().split("\\s+");
        
        // Return the number of words
        return words.length;
    }
}
