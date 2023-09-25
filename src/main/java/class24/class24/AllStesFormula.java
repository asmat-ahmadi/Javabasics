package class24.class24;

import java.util.*;

public class AllStesFormula {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(70);
        System.out.println(numbers);
        HashSet <Integer> number=new HashSet<>(numbers);
        System.out.println(number);
        LinkedHashSet <Integer> number1=new LinkedHashSet<>(numbers);
        System.out.println(number1);
        TreeSet<Integer> number2=new TreeSet<>(numbers);
        System.out.println(number2);
        LinkedList<Integer> number3=new LinkedList<>(numbers);
        System.out.println(number3);

    }
}
