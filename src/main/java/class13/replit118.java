package class13;

public class replit118 {
    public static String spaceOut(String s) {
        StringBuilder spacedString = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Append the current character to the result StringBuilder
            spacedString.append(s.charAt(i));

            // If it's not the last character, append a space
            if (i < s.length() -1) {
                spacedString.append(' ');
            }
        }

        // Append a space at the end, as specified in the examples
        spacedString.append(' ');

        // Convert the StringBuilder to a String and return it
        return spacedString.toString();
    }

    public static void main(String[] args) {
        // Test the spaceOut method with examples
        System.out.println(spaceOut("hello"));        // Output: "h e l l o "
        System.out.println(spaceOut("technology"));   // Output: "t e c h n o l o g y "
    }}

