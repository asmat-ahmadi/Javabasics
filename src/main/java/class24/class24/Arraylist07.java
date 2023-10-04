package class24.class24;

import java.util.ArrayList;

public class Arraylist07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 =new ArrayList<>();
        numbers1.add(111);
        numbers1.add(222);
        numbers1.add(333);
        numbers1.add(444);
        numbers1.add(555);
        numbers1.add(666); // this printout all elements in row
        System.out.println("["+numbers1.get(0) + ", " + numbers1.get(1) + ", " + numbers1.get(2)+", "+numbers1.get(3) + ", " + numbers1.get(4) + ", " + numbers1.get(5)+"]");
       numbers1.removeAll(numbers1);
       System.out.println(numbers1);
        System.out.println("["); // This printout all elements in row in loop and if
        for (int i = 0; i < numbers1.size(); i++) {
            System.out.print(numbers1.get(i));
            if (i < numbers1.size() - 1) {
              System.out.print(", ");
            }
        }
        System.out.println("]");
    }}



