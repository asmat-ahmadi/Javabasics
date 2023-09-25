package class20;

public class E7Final {
    public static void main(String[] args) {
        final int AGE=10;
       // AGE=20;
        System.out.println(AGE);
    }
}
class ParentA {
   //final // if we add final then no child class wont be able to add or change
    void marry(){
        System.out.println("take out permission first");
    }
}
class Child extends ParentA {
    @Override
    void marry(){
        System.out.println("I want to marry some else");
    }
}