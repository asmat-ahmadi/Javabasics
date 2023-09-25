package Class12;

import java.util.Scanner;

public class replit100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("In ");
        String input = scanner.nextLine();
        String reversed = "";

        // Use a for loop to reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}

