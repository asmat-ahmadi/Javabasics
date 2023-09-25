package class24.class24;

import java.util.LinkedHashSet;

public class Hashset01 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits=new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("Mango");
        fruits.add("avacado");
        fruits.add("banana");
        fruits.add("airplane");
        fruits.add("aster");
        fruits.add("aster");
        fruits.add("bird");
        fruits.add("miranda");

        System.out.println(fruits);
        for (String fruit:fruits){
            if(fruit.toLowerCase().startsWith("a")){
                System.out.println(fruit);
        }


        //fruits.forEach(x-> System.out.println(x));
           // System.out.println("******************************");
       // for (String f:fruits ){

          // System.out.println(f);
        }

    }
}
