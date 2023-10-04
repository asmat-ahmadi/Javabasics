package class24.class24;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist01 {
    public static void main(String[] args) {
        // Create a LinkedList to store integers from 50 to 100
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add integers from 50 to 100 to the LinkedList
        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }

        // Use an Iterator to remove numbers not divisible by 3
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 3 != 0) {
                iterator.remove();
            }
        }

        // Print the modified LinkedList
        System.out.println(numbers);
    }
}
