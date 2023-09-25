package Class15;

public class teacher {
    String name;
    String position;
    int salary;
    int overtime;

    public teacher( String name1,String positon1,int salary1,int overtime1){
        name=name1;
        position=positon1;
        salary=salary1;
        overtime=overtime1;
    }
    public void printtotal(){
        int total=(salary+overtime);
        System.out.println("the total salary of "+name+" is equal to "+total);
    }
}
