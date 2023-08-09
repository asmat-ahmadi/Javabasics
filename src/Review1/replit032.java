package Review1;

import java.util.Scanner;

public class replit032 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender: F or M");
        String gender=input.next();
        System.out.println("Please enter your age");
        int age=input.nextInt();

        if (age >25){
            if(gender.equals("F")){
                System.out.println("woman");
            }else {
                System.out.println("Man");
            }}if (age <25){
                if(gender.equals("F")){
                    System.out.println("girl");

                } else {
                    System.out.println("boy");
                }
            }

    }
}
