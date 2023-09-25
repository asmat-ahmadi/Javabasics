package class14;

public class StringObjectsclass11 {
    public static void main(String[] args) {
        String str=new String("Welcome on board");
        String str1=new String("See you again");
        String str2=str1.concat(" Welcome on board");
        String str3=new String(" ladies and gentlemen");
        System.out.println(str2);
        System.out.println("Return Value:");
        System.out.println(str.indexOf("o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("board","java"));
        String s ="I love you much"+" ";
        s=s.concat("all the time"+" ");
        System.out.println(s);
        String str5="";
        boolean b=str5.isEmpty();
        System.out.println(b);
        String str6="ABC";
        boolean b1=str6.isEmpty();
        System.out.println(b1);
        String str7="Welcome to the world";
        System.out.println(str7.startsWith("Welcome"));
        System.out.println(str7.startsWith("World"));
        String str8="Welcome to java";
        char result =str8.charAt(8);
        System.out.println(result);
        String str9=new String("Welcome to java");
        String str10= new String("Welcome to course");
        System.out.println(str10.substring(0,9));
        String mix1="habib1220aa@78##AaaBC!";
        System.out.println(mix1.replaceAll("a","X"));



    }
}
