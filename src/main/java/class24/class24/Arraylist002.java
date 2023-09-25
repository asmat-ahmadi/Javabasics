package class24.class24;

import java.util.LinkedList;

public class Arraylist002 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);
            numbers.add(60);
            numbers.add(70);
            numbers.add(80);
            numbers.forEach(x -> System.out.println(x));
            numbers.remove(2);
            System.out.println(numbers);
            numbers.removeIf(x->x>50);
        System.out.println(numbers);
        numbers.removeIf(x->x<50);
        System.out.println(numbers);

        }
    }
