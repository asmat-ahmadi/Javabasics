package Review1;

import java.util.Scanner;

public class replit021 {
    public static void main(String[] args) {
        /*Write a program that asks the user's age: "Enter your age  "
        Then display it by adding 10 (i.e age + 10) in your final output.*/

        System.out.println("Enter your age");
        Scanner scanner=new Scanner(System.in);
        int age= Integer.parseInt(scanner.next());
        int age1=10;
        int results= age+age1;

        System.out.println("Your age after 10 years is "+results);
    }
}
