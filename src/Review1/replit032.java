package Review1;

import java.util.Scanner;

public class replit032 {
    public static void main(String[] args) {
        System.out.println("Please enter your gender: M and F");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (age > 25) {
            if (gender.equals("F")) {
                System.out.println("woman");

            } else{

                }if(age <25){
                    System.out.println("Man");
                    if (gender.equals("F")) {
                        System.out.println("Girl");

                    } else{
                                System.out.println("boy");
                }


        }
    }}}