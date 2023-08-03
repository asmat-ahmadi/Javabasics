package Class4;

import java.util.Scanner;

public class E4scanner {
    public static void main(String[] args) {
        System.out.println("please enter your name");
        Scanner input=new Scanner(System.in);
       String name= input.next();
        System.out.println("hello "+name);
        if (name.equals("habib")) {
            System.out.println(" case manager");
        } else{
            System.out.println(" dont know you");
        }
    }
}
