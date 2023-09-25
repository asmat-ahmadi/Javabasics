package class13;

public class replit119 {
    public static String ReplaceL(String X, char targetChar) {
        // Create a StringBuilder to build the modified string
        StringBuilder spacing = new StringBuilder();

        // Iterate through each character in the x string
        for (int i = 0; i < X.length(); i++) {
            char replacing = X.charAt(i);

            // Check if the current character matches the target character
            if (replacing == targetChar) {
                // If it matches, append '*' to the modified string
                spacing.append('*');
            } else {
                // If it doesn't match, append the current character to the modified string
                spacing.append(replacing);
            }
        }

        // Convert the StringBuilder to a String and return the modified string
        return spacing.toString();
    }

    public static void main(String[] args) {
        // Test the censorLetter method with examples
        System.out.println(ReplaceL("computer science", 'e')); // Output: "comput*r sci*nc*"
        System.out.println(ReplaceL("trick or treat", 't'));    // Output: "*rick or *rea*"
    }

        }


