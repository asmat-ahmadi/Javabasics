package class20;

public class E4PolyMor {

    public static void main(String[] args) {
       /* Animal a=new Animal();
        a.eat();
        a.sleep();
        a.speak();
        Dog d=new Dog();
        d.speak();
        d.eat();
        d.sleep();
        Cat c=new Cat();
        c.speak();
        c.eat();
        c.sleep();*/
        Animal []arr={new Cat(),new Dog(),new Animal()};
        for (int i = 0; i < arr.length; i++) {
            Animal animal = arr[i];
            animal.eat();
            animal.speak();
            animal.sleep();
            /*for (Animal animal : arr) {
                animal.eat();
                animal.speak();
                animal.sleep();*/

        }

        }
        }



