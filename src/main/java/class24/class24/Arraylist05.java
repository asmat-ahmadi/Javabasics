package class24.class24;

import java.util.ArrayList;

public class Arraylist05 {
    public static void main(String[]args){
        ArrayList<Integer> numbers1 =new ArrayList<>();
        numbers1.add(111);
        numbers1.add(222);
        numbers1.add(333);
        numbers1.add(444);
        numbers1.add(555);
        numbers1.add(666);
        System.out.println(numbers1.get(0)); // print out 0,2,4 indexes only in column
       System.out.println(numbers1.get(1));
       System.out.println(numbers1.get(4));
       // print out 0,2,4 in row by indexes
        System.out.println(numbers1.get(0) + " " + numbers1.get(2) + " " + numbers1.get(4));

}}
