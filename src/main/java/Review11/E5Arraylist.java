package Review11;

import java.util.ArrayList;

public class E5Arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.set(2,"Grapes");
        System.out.println(fruit);
        //fruit.removeAll();
        //fruit.replaceAll();
       // fruit.isEmpty();
       // System.out.println(fruit.indexOf(("Apple")));
       // fruit.
        ArrayList<String> Vegitalbes =new ArrayList<>();
        Vegitalbes.add("potatos");
        Vegitalbes.add("carot");
        Vegitalbes.add("cucumber");
        System.out.println(Vegitalbes);
        Vegitalbes.addAll(fruit);
        System.out.println(Vegitalbes);
        Vegitalbes.removeAll(fruit);
        System.out.println(Vegitalbes);
            }
        }



