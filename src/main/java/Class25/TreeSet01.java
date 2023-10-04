package Class25;

import java.util.LinkedList;

public class TreeSet01 {
    public static void main(String[] args) {
        LinkedList<String> Country=new LinkedList<>(); // TreeSet print out in sort order but not duplicate
        Country.add("null");
        Country.add("Sohil");
        Country.add("Diego");
        Country.add("Alijon");
        Country.add("Sumair");
        for(String C:Country){
            System.out.println(C);

            }
        Country.forEach(name -> System.out.println(name));
        }

    }

