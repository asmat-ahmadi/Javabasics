package Class16;

public class Main3 {
    public String name;
    protected String city;
    String nameoftheschool;
    private int batchnumber;

    public Main3(String name, String city, String nameoftheschool, int batchnumber){
        this.name=name;
        this.city=city;
        this.nameoftheschool= nameoftheschool;
        this.batchnumber=batchnumber;
    }
    public void display(){
        System.out.println("My name is "+ name+ " and I live in " +city+ ".  I study at "+ nameoftheschool+ "in batch"+ batchnumber);
    }
    public static void main(String[]args){
        Main3 info=new Main3("John","Miami","Syntax",9);
        info.display();
    }

}

