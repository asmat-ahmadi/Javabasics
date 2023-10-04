package Class25;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class Map01 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("apple",7.0);
        fruit.put("peach",8.0);
        fruit.put("orange",5.0);
        fruit.put("avacado",9.0);
        fruit.put("banana",8.0);
        fruit.put("banana",4.0);
        System.out.println(fruit); // we can have duplicate values but not the items
        System.out.println(fruit.size());
        TreeMap<String,Double> fruit1=new TreeMap<>(fruit);// the above element with TreeMap
        System.out.println(fruit1);
        Collection <String> onlyF=fruit.keySet(); // shows only fruits
        System.out.println(onlyF);
        Collection <Double> onlyP=fruit.values(); // shows only prices
        System.out.println(onlyP);


    }


}
