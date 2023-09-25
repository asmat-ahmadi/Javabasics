package class24;

import java.util.LinkedList;

public class Arraylist02 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(30);
        numbers.add(12);
        System.out.println(numbers);
        numbers.remove(2);
        numbers.removeIf(x->x>15);
        System.out.println(numbers);
    }
}
