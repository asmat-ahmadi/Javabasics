package Class16;

public class OOPReview {
    public static void main(String[] args) {
        String str="This is a Java class";
        boolean starts=str.startsWith("This");
        boolean ends=str.endsWith("class");
        boolean contain=str.contains("Java");
        int index=str.indexOf("a");
        System.out.println(starts);
        System.out.println(ends);
        System.out.println(contain);
        System.out.println(index);
        System.out.println(str.endsWith("class")); // the same as above in different name
        System.out.println(str.startsWith("This"));// the smae as above in different name
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("a"));
    }
}
