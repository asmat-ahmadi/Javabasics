package Review1;

import java.util.Scanner;

public class Conditionalstatement {
    public static void main(String[] args) {

        int numb = 16;
        if (numb > 15)
            System.out.println(" passed the the exam");
        else if (numb == 15)
            System.out.println(" retake the exam");
        else if (numb < 15)
            System.out.println("failed the exam");
        // The follwing is a condition based on one option if age good to drive or not
        int age = 15;
        if (age >= 15) {  // braket is very important to use with conditon clasue/
            //if(age!=15){  this sign (!)shows Not ; age is not equal to 15
            System.out.println("you can drive ");
        } else {
            System.out.println("you cant drive");
//kjlkjl


            double accountbalance1 = 1000;
            double price = 900;
            if (price >= accountbalance1) {
                System.out.println("i can buy the computer");
            } else {
                System.out.println(" I can not buy the computer");
                //Write a conditional statement starting on line 9 that does the following:
                //- If name is equal to "Chen", print "teacher"
                //- For any other input, print "student"


                Scanner inp = new Scanner(System.in);
                System.out.print("In:");
                String name = inp.nextLine();
                //DO NOT CHANGE ABOVE CODE!  Write your code below
                if (name.equals("Chen")) {
                    System.out.println("teacher");


                } else {
                    System.out.println("student");


                }
            }
        }
    }
}





