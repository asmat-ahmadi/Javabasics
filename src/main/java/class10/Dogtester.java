package class10;

public class Dogtester {
    public static void main(String[] args) {
      //  Creatjing object from the dog class
        Dog lunasObj=new Dog();
        // assigning a value to name using lunasobj
        lunasObj.name="luna";
        lunasObj.gender ="F";
        lunasObj.breed="Shieba";
        lunasObj.weight=10;
        lunasObj.age=20;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);
        //we are calling the bark method on lunaobj
        lunasObj.bark();
        lunasObj.eat();
        lunasObj.sleep();

    }
}
