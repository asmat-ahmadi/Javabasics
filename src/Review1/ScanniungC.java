package Review1;

import java.util.Scanner;

public class ScanniungC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");

        int age = input.nextInt();  //int age = input.nextInt(); we cna use this for int data type
        if (age >=18) {
            System.out.println("You are eligible to vote");
        } else {

        }
   System.out.println("You are not eligible to vote");

    }
}


