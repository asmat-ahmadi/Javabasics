package Class25;

import java.util.LinkedList;

public class LinkedList03 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);
        int sum=0;
        for(Integer number: numbers){
            sum+=number;

        }
        System.out.println("total="+sum);
    }
}
