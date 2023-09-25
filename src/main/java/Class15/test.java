package Class15;

public class test {
    test(){
        System.out.println(1);
    }
    test(String name){
        System.out.println(2);
    }
    test(int age){
        System.out.println(3);
    }
    test(String name,int age){

    }
test(int age,String name){
    System.out.println(5);
}
    public static void main(String[] args) {
        test t=new test(25,"habib");
    }
}
