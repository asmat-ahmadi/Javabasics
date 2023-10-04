package class24.class24;

import java.util.ArrayList;

public class Arrayslist08 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        // Remove elements at indices 1, 3, and 5
        words.remove(4); // Remove "boop" at index 5
        words.remove(2); // Remove "yolo" at index 3
        words.remove(0); // Remove "yo" at index 1
        // this shows the remaining elements after reomoving but the reamining starts back from 0 -1 inedxes
        System.out.println(words.get(0) + " " + words.get(1));
        words.forEach(x-> System.out.println(x)); // shows the remaining as column
       //System.out.println(words.get(1)+words.get(3));
       for (String word : words) {
           System.out.print(word + " ");
        }

    }}

