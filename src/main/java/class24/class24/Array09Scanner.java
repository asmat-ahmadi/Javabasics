package class24.class24;

import java.util.ArrayList;
import java.util.Scanner;

public class Array09Scanner {
    public static void main(String[] args) {
        // Create an ArrayList to hold integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Add 5 elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Print all elements from the ArrayList in one line
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

