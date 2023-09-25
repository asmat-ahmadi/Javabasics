package class24.class24;

import java.util.LinkedList;

public class ArraysConstructor {
    public static void main(String[] args) {
        LinkedList<Dog> dogs=new LinkedList<>();
        dogs.add(new Dog("Jacky","persian"));
        dogs.add(new Dog("Jacky","persian"));
        dogs.add(new Dog("Jacky","persian"));
    }
}
class Dog{
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void printinfo(){
        System.out.println(name+breed);
    }
}