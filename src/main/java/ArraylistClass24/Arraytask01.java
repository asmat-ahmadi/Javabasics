package ArraylistClass24;

import java.util.ArrayList;//1.task to create 4 arrays list and 2. find out
// if array is empty and 3. find BOB if it is in the list and 4.print out all

public class Arraytask01 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        names.add("Habib"); // 1. create 4 arrayslist values
        names.add("Hasib");
        names.add("Bob");
        names.add("Salim");
        System.out.println(names.isEmpty()); //2. find if the array is empty
        System.out.println(names.contains("Bob")); // 3. find out if Bob is in the list
        for (int i = 0; i < names.size(); i++) {  // print out all the elements of the array
            System.out.println(names.get(i));
        }

    }

}
