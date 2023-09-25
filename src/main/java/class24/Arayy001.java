package class24;

import java.util.ArrayList;

public class Arayy001 {
    public static void main(String[] args) {
        //int [] arr=new int[5];    // Array formula to choose size of the array
        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        System.out.println(numbers); // just to print all the list
        numbers.remove(1);     // this choose through index to remove from the list
        numbers.forEach(x-> System.out.println(x)); // just to print all the list
        numbers.removeIf(x->x>50);  // this function show less than 50 we have to deactivate this
        System.out.println(numbers); // to work the new function of greater than 50
        numbers.removeIf(x->x<50); // this function shoes less greater than 50
        System.out.println(numbers);




    }
}
