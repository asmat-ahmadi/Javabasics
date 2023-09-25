package class20;

public class Replit0000 {
    public static boolean alphabetical(char c1, char c2) {
        // Compare the characters in alphabetical order
        return c1 < c2;
    }

    public static void main(String[] args) {
        // Test the method with example cases
        System.out.println(alphabetical('a', 'b')); // Should print true
        System.out.println(alphabetical('a', 'a')); // Should print false
        System.out.println(alphabetical('b', 'a')); // Should print false
        System.out.println(alphabetical('d', 'z')); // Should print true
        System.out.println(alphabetical('z', 'x')); // Should print false
    }
}

