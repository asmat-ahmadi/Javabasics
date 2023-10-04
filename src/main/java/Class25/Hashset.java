package Class25;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> num=new HashSet<>(); // HashSet never accept du[licate and insertion order
        num.add(111);
        num.add(111);
        num.add(111);
        num.add(999);
        num.add(999);
        num.add(999);
        for(Integer number:num){
        System.out.print(number+" ");

    }
}}
