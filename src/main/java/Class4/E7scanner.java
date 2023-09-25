package Class4;

import java.util.Scanner;

public class E7scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your full name");
        String name=scanner.nextLine(); // if we put Line with next it can show all the words with your name//
        System.out.println("your full name is "+name);
    }
}
