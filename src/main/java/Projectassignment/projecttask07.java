package Projectassignment;

public class projecttask07 {
    public static void main(String[] args) {
        int n = 10;
        int[] fn = new int[n];

        // First two Fibonacci numbers
        fn[0] = 0;
        fn[1] = 1;

        // Generate the rest of the Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fn[i] = fn[i - 1] + fn[i - 2];
        }

        // Print the Fibonacci series
        System.out.println("The first " + n + " Fibonacci numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fn[i] + " ");
        }
    }
}








