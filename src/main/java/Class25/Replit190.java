package Class25;

import java.util.LinkedList;

public class Replit190 {

    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(13);
        numbers.add(21);
        numbers.add(34);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        }
}
