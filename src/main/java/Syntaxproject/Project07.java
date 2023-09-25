package Syntaxproject;

import java.util.ArrayList;

public class Project07 {


    public static void main(String[] args) {
        ArrayList <String> fruits=new ArrayList<>();
        fruits.add("APRICATE");
        fruits.add("ORANGE");
        fruits.add("APPLE");
        fruits.add("AVOCADO");
        fruits.add("PEACH");
        System.out.println("The following fruits listed by alphabet A");
        ArrayList<String>filter=new ArrayList<>();
        for (String f:fruits){
            if(f.startsWith("A")){
                filter.add(f.toLowerCase());

                System.out.println("fruits which starts by A: "+f);
            }

        }

    }
}

