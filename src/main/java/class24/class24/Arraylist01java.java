package class24.class24;

import java.util.ArrayList;

public class Arraylist01java {
    public static void main(String[] args) {
        int[] arr=new int[5];
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(30);
        numbers.add(12);
       numbers.forEach(x-> System.out.println(x));


    }
}
