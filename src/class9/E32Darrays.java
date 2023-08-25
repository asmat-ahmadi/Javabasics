package class9;

import java.util.Arrays;

public class E32Darrays {
    public static void main(String[] args) {
       // int [] row= {10,20,30,40};
       // int [] row= {100,200,303,400};
       // int [] row= {1,2,3,4};


        int [][]numbers= {
                {10, 20, 30, 40},
                {100, 200, 303, 40},
                {100, 200, 303, 400}};
        int[] row = numbers[0];
        int number = numbers[0][1];
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers));
        }
    }

