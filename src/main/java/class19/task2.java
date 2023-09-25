package class19;

public class task2 {
    public void display(){
        System.out.println("I love programming lanaguage");
    }
    public void display(String text){
        System.out.println(" I live "+text);
    }

    public static void main(String[] args) {
        task2 t1=new task2();
        t1.display();
        t1.display("Syntax Class");

    }
}
