package class18;

public class Main {
    static String maxLength(String[] words) {
        if (words == null || words.length == 0) {
            return null; // Handle the case when the array is empty or null
        }

        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String[] words = {"hey","yolo","hi","this is long"};

        // Call the maxLength method from the WordUtils class
        String longestWord = Main.maxLength(words);

        System.out.println(longestWord); // Should print "this is long"
    }
}
