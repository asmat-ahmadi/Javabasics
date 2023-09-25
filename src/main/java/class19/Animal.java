package class19;

public class Animal  {
    protected String name;
    private String color;
    private int age;
    int total=10;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void printInfo(){
         System.out.println(name+ " "+color+" "+age);
     }
}
class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public void printInfo(){
        System.out.println("my own method");  // this will be prefered to be pritned out
}



    public static void main(String[] args) {
        Dog d=new Dog("Jacki","black",8);
        d.printInfo();
        System.out.println(d.total);
    }
}