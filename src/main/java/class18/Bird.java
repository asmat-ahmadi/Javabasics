package class18;

public class Bird {
    private String name;
    private String color;
    private String habitat;
    private int age;
    public Bird(String name,String color,String habitat,int age){
        this.name=name;
        this.color=color;
        this.habitat=habitat;
        this.age=age;
    }
    void info(){
        System.out.println(name+" "+color+" "+habitat+" "+age);
    }
}
class Sparrow extends Bird{

    public Sparrow(String name,String color,String habitat,int age){
        super(name,color,habitat,age);

    }
}
class Parrot extends Bird{

    public Parrot(String name,String color,String habitat,int age) {
        super(name, color, habitat, age);
    }
}