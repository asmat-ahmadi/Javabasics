package Review11;

import java.util.ArrayList;

public class E6Arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");
       fruit.replaceAll(x->{
           if(x.contains("a")){
               return "water";
           }else {
               return x;
           }

       });
        System.out.println(fruit);
            }
        }



