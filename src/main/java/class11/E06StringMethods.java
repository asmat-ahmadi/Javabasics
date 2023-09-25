package class11;

public class E06StringMethods {
    public static void main(String[] args) {
        String str="dkdDjdjdj8798798ABNG7$$%6&#AS";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));
        System.out.println(str.replaceAll("[dkd]",""));
        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str.replaceAll("[^A-Za-b0-9]",""));

    }
}
