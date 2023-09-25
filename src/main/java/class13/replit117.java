package class13;

public  class replit117 {
    public static int sumEvenToX(int x) {
        int sum = 0;

        // Iterate through numbers from 1 to x
        for (int i = 1; i <= x; i++) {

            // Check if the number is even
            if (i % 2 == 0) {
                // If it's even, add it to the sum
                sum += i;
            }
        }

        // Return the final sum of even numbers
        return sum;
    }

    public static void main(String[] args) {
        // Test the sumEvenToX method with examples
        System.out.println(sumEvenToX(6));  // Output: 6
        System.out.println(sumEvenToX(8));  // Output: 20
    }


}
