package HmeReviewloopArrays;

import java.util.Scanner;

public class habibasmat4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age if are eleigilr to vote");
        int age=input.nextInt();
        if(age >=18){
            System.out.println(" you are eligible to vote ");

        }
        else {
            System.out.println("you are not eleiglbe to vote ");
        }
    }


}
