package class2;

public class E14SharthandOperator {
    public static void main(String[] args) {
        int number = 10; // this number is no longer 10 it is actually 20 per the update below
        number*=2;
        System.out.println(number); //20
        //new update makes number 20
        System.out.println(number+number); //40

    }
}
