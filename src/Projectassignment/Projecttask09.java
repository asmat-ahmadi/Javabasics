package Projectassignment;

public class Projecttask09 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 6, 89, 23, 67, 98, 34, 1, 55}; // Sample array

        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        int secondLargest = Integer.MIN_VALUE; // Initialize secondLargest to the smallest possible integer

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number in the array is: " + secondLargest);
        } else {
            System.out.println("No second largest number found in the array.");
        }
    }
}

