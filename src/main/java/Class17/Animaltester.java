package Class17;

public class Animaltester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="Tom";
        c.breed="Persian";
        c.color="White";
        c.age=8;
        c.attitude=true;
        c.printinfo();
        Dog d=new Dog();
        d.name="jacky";
        d.breed="German";
        d.color="Red";
        d.age=10;

        d.printinfo();
    }
}
