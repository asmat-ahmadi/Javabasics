package Syntaxproject;

public class project03 {
    public static boolean isPalindrome(String input) {
        // Remove spaces and convert the input string to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Create a StringBuilder from the input string
        StringBuilder builder = new StringBuilder(input);

        // Reverse the StringBuilder
        builder.reverse();

        // Convert the reversed StringBuilder back to a string
        String reversedString = builder.toString();

        // Compare the original string with the reversed string
        return input.equals(reversedString);
    }

    public static void main(String[] args) {
        String palindrome1 = "madam";
        String palindrome2 = "racecar";
        String notPalindrome = "hello";

        System.out.println(palindrome1 + " is a palindrome: " + isPalindrome(palindrome1));
        System.out.println(palindrome2 + " is a palindrome: " + isPalindrome(palindrome2));
        System.out.println(notPalindrome + " is a palindrome: " + isPalindrome(notPalindrome));
    }
}

