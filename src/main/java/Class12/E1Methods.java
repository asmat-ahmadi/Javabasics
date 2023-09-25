package Class12;

import java.util.Scanner;

public class E1Methods {
    public static void main(String[] args) {


    }

    void takeUserInput(){
        Scanner scanner = new Scanner(System.in);
        //we are creating the object of Scanner class
        System.out.println(" Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("your name is " + name + " and your age are" + age + "years old");
        if (age < 18) {
            System.out.println("you are not allowed to vote enter the detials of the next perosn");
    }}}
