package Review1;

import java.util.Scanner;

public class extrareplit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age=input.nextInt();
        if(age >40){
            System.out.println("you are almost old");
            int weight=input.nextInt();
            if(weight>180){
                System.out.println("you are fat and over age");
            } else{
                System.out.println("you are in great sahpe");
            }
        }
    }
}
