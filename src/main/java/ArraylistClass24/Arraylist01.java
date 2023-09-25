package ArraylistClass24;

import java.util.ArrayList;

public class Arraylist01 {

    public static void main(String[] args) {
       // String[]name={"add","wajed"};
        ArrayList< String > name=new ArrayList<>();
        name.add("Habib");  // habib was romoved then Hasib became index (0)
        name.add("Hasib");
        name.add("Bob");
        name.add("Salim");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(i); // print out the index of the list
            System.out.println(name.get(i)); // print out the actual name of elements
        }
        System.out.println("*****************");
        for(String n:name){      // print out the actual name of elements
            System.out.println(n);
        }
        System.out.println("******************************");
        int i=0;        // print out the actual name of elements
        while(i<name.size()){
            System.out.println(name.get(i));
            i++;
        }
    }
}
