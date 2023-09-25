package class20;

public class Teacher {
    String name;
    String lastname;
    int age;
    public Teacher( String name,String lastname, int age){
        this.name=name;
        this. lastname=lastname;
        this.age=age;
    }
}
class Student1 extends Teacher{
    int grade;
public Student1(String name,String lastname,int age,int grade){
    super(name,lastname,age);
    this.grade=grade;
}
 void printinfo(){
    System.out.println(name+" "+lastname+" "+age+" "+grade);
}
}
class admin extends Teacher{
    String address;
    public admin(String name,String lastname,int age,String address){
        super(name,lastname,age);
        this.address=address;
    }
    void printinfo(){
        System.out.println(name+" "+lastname+" "+age+" "+address);
    }
}

class tester{
    public static void main (String[]args){
        Student1 s1=new Student1("habib","ahmadi",45,75);
        admin a1=new admin("asmat","ahmadi",20,"virginia");
        s1.printinfo();
        a1.printinfo();
    }
}


