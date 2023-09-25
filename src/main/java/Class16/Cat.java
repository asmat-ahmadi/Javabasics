package Class16;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private String color;
    private char gender;
    private double price;

    public Cat(){

    }

    public Cat(String name1,String breed1,int age1){
        name=name1;
        breed=breed1;
        age=age1;

    }
    public Cat(String name1,String breed1,int age1,char gender1){
        name=name1;
        breed=breed1;
        age=age1;
        gender=gender1;


    }
    public Cat(String name1,String breed1,int age1,char gender1,double price1){
        name=name1;
        breed=breed1;
        age=age1;
        gender=gender1;
        price=price1;
    }
    public void printinfo(){
        System.out.println(name+" "+breed+" "+age+" "+gender+price);
    }
    public void printinfo1() {
        System.out.println(name + " " + breed + " " + age);
    }
}
