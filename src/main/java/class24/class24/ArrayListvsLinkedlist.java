package class24.class24;

import java.util.LinkedList;

public class ArrayListvsLinkedlist {
    public static void main(String[] args) {
        long startingTime=System.currentTimeMillis();
      // System.out.println(startingTime);
       LinkedList<Integer> numbers=new LinkedList<>();
        //ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0,i);   // when we run to access the elements it takes
            for (int j = 0; j < 1000; j++) {  // very less time time than linkedlist.
                System.out.println(numbers.get(100000));

            }

        }
        long endingtime=System.currentTimeMillis();
        long timetook=(endingtime-startingTime);
        System.out.println(timetook);
    }
}
