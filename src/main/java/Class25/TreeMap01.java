package Class25;

import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
            TreeMap<String,Double> fruit = new TreeMap<>();
            fruit.put("apple", 7.0);
            fruit.put("peach", 8.0);
            fruit.put("orange", 5.0);
            fruit.put("avocado", 9.0);
            fruit.put("banana", 8.0);
            fruit.put("banana", 4.0);// we can also use (k,v)instead of key,value
            fruit.forEach((key,value)-> System.out.println(key+" "+value));
        fruit.forEach((key,value)-> System.out.println(key+" "));//only keys
        fruit.forEach((key,value)-> System.out.println(" "+value));//ony values
    }
}
