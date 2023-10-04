package Class25;

import java.util.LinkedList;
import java.util.List;

public class Linked011 {
    public static void main(String[] args) {

            List<String> countries = new LinkedList<>();
            countries.add("Armenia");
            countries.add("USA");
            countries.add("Kazakhstan");
            countries.add("Australia");
            countries.add("Pakistan");
            countries.add("Russia");
            countries.add("Azerbaijan");
       for (String filter:countries){
           if(!filter.startsWith("A")){ // print out those which is not started with A letter
               System.out.print(filter+" ");
           }
       }

        }
    }


