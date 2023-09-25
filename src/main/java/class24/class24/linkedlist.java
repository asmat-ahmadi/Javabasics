package class24.class24;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Cat> dogs=new LinkedList<>();
        dogs.add(new Cat("Jacky","Persian"));
        dogs.add(new Cat("Jim","German"));
        dogs.add(new Cat("Jam","American"));
        Cat d=dogs.get(0);
        d.printInfo();
    }
}
class Cat {
    String name;
    String breed;
    int age;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
public Cat(){

}
    void printInfo(){
        System.out.println(name+" "+breed);
    }
}

