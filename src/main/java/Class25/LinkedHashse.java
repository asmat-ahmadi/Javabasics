package Class25;

import java.util.LinkedHashSet;

public class LinkedHashse {
    public static void main(String[] args) {
        LinkedHashSet<String> collection=new LinkedHashSet<>();
        collection.add("Red");
        collection.add("Pink");
        collection.add("Yellow");
        collection.add("White");
        collection.add("Black");
        System.out.println("Orignial Hash Set:"+collection);

        int size= collection.size();// showa the number of the elements in index form
        System.out.println("Size of the Hash Set:"+size);

    }
}
