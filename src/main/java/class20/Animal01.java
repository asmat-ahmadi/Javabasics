package class20;

public class Animal01 {
    void speak() {
        System.out.println("Animal can speak");
    }

    void sleep() {
        System.out.println("Animal can sleep a lot ");
    }


    void eat() {
        System.out.println("Animal can eat differernt food");
    }
}
 class Dog01 extends Animal01{
    @Override
     void speak(){
        System.out.println("Can speak like whuff wuff");
    }
 }
class Cat01 extends Animal01 {
    @Override
    void speak() {
        System.out.println("can speak like Meo Meo");
    }
}