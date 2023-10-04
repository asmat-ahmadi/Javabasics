package class24.class24;

import java.util.ArrayList;

public class Arraylist06 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers1 =new ArrayList<>();
        numbers1.add(111);
        numbers1.add(111);
        numbers1.add(333);
        numbers1.add(555);
        numbers1.add(555);
        numbers1.add(666);
        numbers1.forEach(x-> System.out.println(x));
    }

}
