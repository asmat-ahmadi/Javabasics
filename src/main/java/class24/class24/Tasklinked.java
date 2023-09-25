package class24.class24;

import java.util.LinkedList;

public class Tasklinked {

}
class Cat001 {
    private String name;
    private int age;
    private String color;

    // Constructor to initialize the cat's information
    public Cat001(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Method to print the cat's information
    public void printInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Cat Age: " + age + " years");
        System.out.println("Cat Color: " + color);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create three Cat objects
        Cat001 cat1 = new Cat001("Whiskers", 2, "Gray");
        Cat001 cat2 = new Cat001("Mittens", 3, "White");
        Cat001 cat3 = new Cat001("Felix", 5, "Black");

        // Create a LinkedList to store the Cat objects
        LinkedList<Cat001> catList = new LinkedList<>();

        // Add the Cat objects to the LinkedList
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);

        // Call the printInfo method for each Cat object in the LinkedList
        for (Cat001 cat : catList) {
            cat.printInfo();
        }
    }
}
