package class24.class24;

import java.util.LinkedHashSet;

public class LinkedHashset01 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("avacado");
        fruits.add("banana");
        fruits.add("airplane");
        fruits.add("aster");
        fruits.add("aster");
        fruits.add("bird");
        fruits.add("miranda");

        System.out.println(fruits);
        for (String fruit : fruits) {
            if (fruit.toLowerCase().startsWith("a")) {
                System.out.println(fruit);
            }
        }
    }}