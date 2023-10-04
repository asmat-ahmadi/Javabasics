package class24.class24;

import java.util.Iterator;
import java.util.LinkedList;
// numbers from 70-100 remove all nums is not divisiable by 3
public class linkedlist002 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 69; i < 100; i++) {
            numbers.add(i);
            System.out.println(i);
        }
        Iterator<Integer> iterat=numbers.iterator();
        while (iterat.hasNext()){
        int num=iterat.next();
        if(num % 3 !=0){
            iterat.remove();

            }
    }
        System.out.println(numbers);
}}
