package class21;

public abstract class Animal {
    //String name;
    //String breed;
    //String color;

    abstract void speak();//{
       // System.out.println(" Animal can speak");
   // }
   abstract void sleep();//{
        //System.out.println("animal can sleep");
    //}
   abstract void eat();//{
       // System.out.println("Animal can eat ");
// this is Parent class including three fields and three methodes inside it.//

   // }
}
class dog extends Animal{
    @Override
    void speak(){
        System.out.println(" wuff wuff");
    }
    @Override
    void sleep(){
        System.out.println(" sleep for 10 hours");
    }
    @Override
    void eat(){
        System.out.println(" eat bones and meat");
    }
}
class cat extends Animal{
    @Override
    void speak(){
        System.out.println(" Mew mew");
    }
    @Override
    void sleep(){
        System.out.println(" sleep for 12 hours");
    }
    @Override
    void eat(){
        System.out.println(" eat bones and chicken");
    }
}