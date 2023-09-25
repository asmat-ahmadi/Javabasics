package ArraylistClass24;

import java.util.ArrayList;

public class Array02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(90);
        numbers.add(30);
        numbers.add(50);
        numbers.add(70);
        numbers.add(20);
        System.out.println(numbers);// this one shows the total of list individually
        int sum = 0;  // this one shows the total of the numbers
        for (Integer n : numbers) {
            if (n > 50) {  // when we add this condition it shows
                sum += n;   // the total of numbers above 50
            }
        }
        System.out.println(sum);
    }}
