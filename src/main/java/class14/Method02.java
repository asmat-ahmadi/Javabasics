package class14;

public class Method02 {
    public int add(){
        int a=10;
        int b=15;
        int sum=a+b;
        return sum;

    }


    public static void main(String[] args) {
        Method02 obj2=new Method02();
        int x=obj2.add();
        System.out.println(x);

    }
}
