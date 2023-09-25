package Review9;

public class Parent {
    String name="James";
    void printHello() {
        System.out.println("Hello world");
    }
        Parent(){
            System.out.println("Parent class constructor");
        }
    }
class Child extends Parent{
    String name="John";
    void printHello(){
        System.out.println("Hello java");
    }
    void test(){
        String name="white";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
    void methodtest(){
        super.printHello();
    }

}
