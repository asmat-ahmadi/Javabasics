package Class25;

import java.util.TreeMap;

public class TreeMapIf02 {
    public static void main(String[] args) {
        TreeMap<String,Double> fruit = new TreeMap<>();
        fruit.put("apple", 7.0);
        fruit.put("peach", 8.0);
        fruit.put("orange", 5.0);
        fruit.put("avocado", 9.0);
        fruit.put("banana", 8.0);
        fruit.put("banana", 4.0);
        System.out.println(fruit);
        fruit.forEach((k,v)-> { // this loop will iterate
            if (k.contains("d")) {// this condition will show the word which has"d"
                System.out.println(v);// This printout shows the value of that word
            }
        });
    }
}
