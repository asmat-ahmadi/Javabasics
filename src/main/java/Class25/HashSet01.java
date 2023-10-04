package Class25;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet<String> num=new HashSet<>(); // HashSet never accept du[licate and insertion order
        num.add("third");
        num.add("first");
        num.add("second");
        System.out.println(num);
        num.removeAll(num);
        System.out.println(num);


    }
}
