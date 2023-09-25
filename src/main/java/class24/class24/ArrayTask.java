package class24.class24;

import java.util.HashSet;
import java.util.TreeSet;

public class ArrayTask {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        names.add("john");
        names.add("Jane");
        names.add("james");
        names.add("Jane");
        System.out.println(names);
        TreeSet<String> name=new TreeSet<>(names);
        System.out.println(name);
        names.clear();
        System.out.println(names);
        names.addAll(names);
        System.out.println(name);

    }
}
