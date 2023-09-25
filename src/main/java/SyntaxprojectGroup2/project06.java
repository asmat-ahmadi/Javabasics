package SyntaxprojectGroup2;

public class project06 {
    public static char firstNonRepeatingChar(String input) {
        for (char c : input.toCharArray()) {
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        char result = firstNonRepeatingChar(input);
        if (result != ' ') {
            System.out.println("here is the repeated word: " + result);
        } else {
            System.out.println("There is no repeated words in here.");
        }
}}
