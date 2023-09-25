package class24.class24;

import java.util.ArrayList;
import java.util.HashSet;

public class hashSetArrayLinked {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();// Arrayand linked list shows the whole numbers
        numbers.add(10);                            // Arrayand and linked has insertion order
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
        HashSet<Integer> uniq =new HashSet<>(); // Hashset doesnt show duplicate numbers
        uniq.add(10);  // hashset has no guarantee to be in order due to insertion
        uniq.add(20);
        uniq.add(30);
        uniq.add(10);
        uniq.add(20);
        System.out.println(uniq);


    }

}
