package Class4;

import java.util.Scanner;

public class IfelseStatementreview {
    public static void main(String[] args) {
        System.out.println(" Put your age if you get any discount");
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();

        if (age >56){
            System.out.println(" you get 20 % discount");

        }else if(age < 40){
            System.out.println("you will get 30 % discount");

        }else if(age>60){
            System.out.println(" you will get 50 % discount");

        }else {
            System.out.println("you will get no discount");
        }
    }
}
