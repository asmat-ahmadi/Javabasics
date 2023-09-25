package class13;

public class E2instanceVtester {
    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println(E2instanceVariables.country);
        E2instanceVariables e2=new E2instanceVariables();
        e2.printAge();
    }
}
