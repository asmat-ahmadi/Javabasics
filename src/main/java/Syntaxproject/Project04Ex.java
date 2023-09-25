package Syntaxproject;

public class Project04Ex {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String word1 = "quick";
        String word2 = "lazy";

        int index1 = sentence.indexOf(word1);
        int index2 = sentence.indexOf(word2);

        if (index1 != -1 && index2 != -1) {
            System.out.println("Index of '" + word1 + "': " + index1);
            System.out.println("Index of '" + word2 + "': " + index2);
        } else {
            System.out.println("One or both words not found in the sentence.");
        }
    }
}

