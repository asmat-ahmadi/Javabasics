package Class25;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        HashMap<String,String> country=new HashMap<>();
        country.put("Afghanistan","Kabul");
        country.put("France","Paris");
        country.put("Iran","Tehran");
        country.put("America","Washington.DC");
        country.put("Pakistan","Islamabad");
        country.forEach((key,value)-> System.out.println(key+" "+value));
        country.forEach((key,value)-> System.out.println(" "+value));
        country.forEach((key,value)-> System.out.println(key+" "));
            TreeMap<String,String> country1=new TreeMap<>(country);
            System.out.println(country1);


        }
    }



