package class23;

public class Person {
    public String name;
    public int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
 class Main{
    public static void main(String[] args) {
        Person p=new Person("John",30);

        p.setAge(35);
        p.setName("Habib");
        System.out.println("name:"+p.getName());
        System.out.println("age:"+p.getAge());

    }
}