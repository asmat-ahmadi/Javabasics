package SyntaxprojectGroup2;

import java.util.Arrays;

public class project05 {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if (word1.length() != word2.length()) {
            System.out.println("It is not anagram");


            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("that is anagaram");
            } else {
                System.out.println("It is not anagaram");
            }
        }}}