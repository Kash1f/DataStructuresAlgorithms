package InterviewQuestions;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Step 1: Define two words to check if they are anagrams
        String str1 = "listen";  // First word
        String str2 = "silent";  // Second word

        // Step 2: Convert both strings into arrays of characters
        char[] charArray1 = str1.toCharArray();  // Convert "listen" to ['l', 'i', 's', 't', 'e', 'n']
        char[] charArray2 = str2.toCharArray();  // Convert "silent" to ['s', 'i', 'l', 'e', 'n', 't']

        // Step 3: Sort the character arrays in alphabetical order
        Arrays.sort(charArray1);  // After sorting: ['e', 'i', 'l', 'n', 's', 't']
        Arrays.sort(charArray2);  // After sorting: ['e', 'i', 'l', 'n', 's', 't']

        // Step 4: Compare the sorted arrays to see if they are the same
        if (Arrays.equals(charArray1, charArray2)) {
            // Step 5: If they are the same, print that the words are anagrams
            System.out.println("The words are anagrams.");
        } else {
            // Step 6: If they are not the same, print that the words are not anagrams
            System.out.println("The words are not anagrams.");
        }
    }
}
