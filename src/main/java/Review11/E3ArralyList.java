package Review11;

import java.util.ArrayList;

public class E3ArralyList {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("Ali");
        names.add("Jamel");
        names.add("Rai");
        names.add("Aya");
        names.add("Aya");
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.remove(1));
        System.out.println(names.remove("Aya"));
        System.out.println(names.contains("Jamel"));
      names.removeIf(x->x.equals("Aya")); // removing all the same items as slected
        System.out.println(names);

    }
}
