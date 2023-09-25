package RecentReplit;

public class Main {
    public  final  String Revers(String input){
        StringBuilder Re=new StringBuilder(input);
        return Re.reverse().toString();
    }

    public static void main(String[] args) {
        Main obj1=new Main();
        String Revers=obj1.Revers("Hello");
        System.out.println(Revers);
    }
}
