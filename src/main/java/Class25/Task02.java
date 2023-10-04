package Class25;

import java.util.LinkedHashMap;

public class Task02 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> builing=new LinkedHashMap<>();
        builing.put(1,"amason");
        builing.put(2,"google");
        builing.put(1,"amason");
        builing.put(4,"google");
        builing.put(5,"Bank");
        builing.put(6,"MSO");
        builing.put(7,"Store");
        builing.put(8,"MGM");
        System.out.println(builing); // show all elements
        System.out.println("compnysize"+builing.size()); // shows all elements size in indexform
        System.out.println("replace"+builing.replace(6,"LLC"));// replace elements
        System.out.println("removed"+builing.remove(1));// remove elements
        System.out.println(builing);// show all elements after changes


    }
}
