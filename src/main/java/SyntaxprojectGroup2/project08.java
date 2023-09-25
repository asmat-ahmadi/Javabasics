package SyntaxprojectGroup2;

public class project08 {
    public static String convert(String num){
        int convert=Integer.parseInt(num);

        int add=convert+1;

        String results=Integer.toString(add);

        return results;

    }

    public static void main(String[] args) {
        String num="12";
        String num1=convert(num);
        System.out.println(num1);
    }
}
