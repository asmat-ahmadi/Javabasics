package Class16;

public class replit135 {








    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }

    static String surround(String s,String c){
        return s.replaceAll(c,"("+c+")");
    }
}
