package Class15;

public class Gradesheet {
    String name;
    double grade1;
    double grade2;
    double grade3;

    public Gradesheet(String name1,int grade01,int grade02,int grade03){
        name=name1;
        grade1=grade01;
        grade2=grade02;
        grade3=grade03;
    }
    public void printtotalA(){
        double total=((grade1+grade2+grade3)/3);
        System.out.println(name+"has the "+total+" is the average grade of the student");

    }
}
