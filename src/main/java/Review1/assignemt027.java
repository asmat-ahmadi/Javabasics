package Review1;

import java.util.Scanner;

public class assignemt027 {
    public static void main(String[] args) {
        //Write a Java program to ask age "Please enter your age".
        //Based on the age define whether the user is eligible to vote or not.
        //A person who is eligible to vote must be older or equal to 18 years old and the program will show "You are eligible to vote".
        //Otherwise, the program will show "You are not eligible to vote".
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");

        int age = input.nextInt();
        if (age >=18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");

        }
    }
}