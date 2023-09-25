package review7;

public class Superheroes {
    String name,power ;

    int age;
    char gender;
    Superheroes(String name,String power){
       this. name=name;
       this.power=power;


    }
    Superheroes(String name,String power,int age) {
       this(name,power);
        //this.name = name;
        //this.power = power;
        this.age = age;
    }
    public static void main(String[] args) {
        Superheroes hero1=new Superheroes("Superman","Fly");
        Superheroes hero2=new Superheroes("batman","money",27);
        System.out.println(hero1);
        System.out.println(hero2);
        }
    }

