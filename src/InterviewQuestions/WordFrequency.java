package InterviewQuestions;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "hello world hello everyone";  // Example string
        String word = "hello";  // Word to find frequency of

        String[] words = str.split(" ");  // Split the string into words
        int count = 0;

        // Count occurrences of the word
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                count++;
            }
        }

        System.out.println("Frequency of '" + word + "': " + count);
    }
}

