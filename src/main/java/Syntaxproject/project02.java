package Syntaxproject;

public class project02 {
    public static String reverseString(String input) {
        // Convert the input string to a StringBuilder
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        String reversedString = builder.toString();
        return reversedString;
    }

    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
