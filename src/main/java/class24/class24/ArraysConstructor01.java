package class24.class24;
import java.util.LinkedList;
public class ArraysConstructor01 {
    public static void main(String[] args) {
        LinkedList<Cat1> cats=new LinkedList<>();
        cats.add(new Cat1("lembo","german",13));
        cats.add(new Cat1("Jimbo","persian",12));
        cats.add(new Cat1("timbp","london",15));
        cats.add(new Cat1("lembo","german",18));
        cats.add(new Cat1("Jimbo","persian",19));
        cats.add(new Cat1("timbp","london",15));
       // for (int i = 0; i < cats.size(); i++) {//This forloop formula shows the whole info for each array
          //  cats.get(i).printinfo();
            cats.forEach(x->x.printinfo()); // This lambdos formula shows the whole info for each array
        }
        //Cat1 c=cats.get(1);
        //c.printinfo();
            }

class Cat1{
    String name;
    String breed;
    int age;

    public Cat1(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    void printinfo(){
      //  System.out.println(name+"  "+breed+" "+age);
        System.out.println("name: "+name);
        System.out.println("breed "+breed);
        System.out.println("age "+age);
    }
}