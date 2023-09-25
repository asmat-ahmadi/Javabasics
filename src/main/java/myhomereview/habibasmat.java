package myhomereview;

import java.util.Scanner;

public class habibasmat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age if your are eligbile to dirve");
        int age= input.nextInt();
        if(age >=18){
            System.out.println("You are eligible to drive");

        }
        else{
            System.out.println(" you are not eleigible ");
        }
    }
}
