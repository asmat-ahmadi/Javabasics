package ArraylistClass24;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList < String > name=new ArrayList<>();
        name.add("Habib");  // habib was romoved then Hasib became index (0)
        name.add("Hasib");
        name.add("Bob");
        name.add("Salim");
        name.remove(0); // first way to remove someone
        name.remove("Habib"); // second way to remove someone
        System.out.println(name);
        name.add("Tom");
        System.out.println(name); // adding new one at end of list
        name.remove(0);
        System.out.println(name);
        name.set(1,"Asmat"); // set can replace one name to new name
        System.out.println(name);
    }
}
