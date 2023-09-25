package ArraylistClass24;

import java.util.ArrayList;

public class Array03 {
    public static void main(String[] args) {
        ArrayList <String> fruits=new ArrayList<>();
        fruits.add("Apricate");
        fruits.add("orange");
        fruits.add("Apple");
        fruits.add("Avacado");
        fruits.add("peach");
        ArrayList<String>filter=new ArrayList<>();
        for (String f:fruits){
            if(f.startsWith("A")){
               filter.add(f.toLowerCase());
                System.out.println(f);
            }

        }

    }
}
