package class9;

public class E4darrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {100, 200, 303, 404},
                {100, 200, 32, 22}};
        for (int row = 0; row < numbers.length; row++) { // we can use row.length too instead of 2
            for (int col = 0; col < numbers.length; col++) { // we can use row.length too instead of 4
               // if(numbers[row][col]%2==0){ // shows only even numbers
                if(numbers[row][col]%2!=0){  // odds numbers
                System.out.print(numbers[row][col]+" ");

            }

        }
            System.out.println();
    }}}
