package class21;


public class Parent {
    Parent(String city) {
        System.out.println(city);
    }

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child(String city) {
        super(city);
    }
}

