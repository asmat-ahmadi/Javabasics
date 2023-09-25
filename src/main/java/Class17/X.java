package Class17;

public class X {
    String name;
    void printinfo(){
        System.out.println("name");
    }

}
class Z extends X {
    String lastname;
    void printColor(){
        System.out.println(lastname);
    }

}

class Y extends Z {

    void printNameColor(){
        System.out.println(name+" "+lastname);
    }
}