package Class12;

import java.util.Scanner;

public class classPractice01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("your name is "+name+" and your age is "+age+ " years old");
        if(age >21){
            System.out.println("you are alloowed to drink");
        }
        else {
            System.out.println("you are underage and not allowed to drink");
        }

    }
}
