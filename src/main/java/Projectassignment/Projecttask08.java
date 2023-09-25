package Projectassignment;

public class Projecttask08 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 6, 89, 23, 67, 98, 34, 1, 55}; // Sample array

        int max = numbers[0]; // Assume the first element as maximum
        int min = numbers[0]; // Assume the first element as minimum

        for (int num : numbers) {
            if (num > max) {
                max = num; // Update maximum if a larger number is found
            }
            if (num < min) {
                min = num; // Update minimum if a smaller number is found
            }
        }

        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}

