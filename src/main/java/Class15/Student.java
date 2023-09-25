package Class15;

public class Student {
    String name;
    double marks1;
    double marks2;
    double marks3;

    public Student(String sName,double smarks1,double smarks2,double smarks3){
        name=sName;
        marks1=smarks1;
        marks2=smarks2;
        marks3=smarks3;

    }
    public void printave(){
        double avg=((marks1+marks2+marks3)/3);
        System.out.println(name+"Got"+avg);
    }
}
