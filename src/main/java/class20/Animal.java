package class20;

public class Animal {
    void speak() {
        System.out.println("Amimal can speak");
    }
    void sleep() {
        System.out.println("animal sleep");
    }
    void eat() {
        System.out.println("Animal eat");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("wuff wuff");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Meow meow");
    }
}

