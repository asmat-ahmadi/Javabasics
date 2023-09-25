package Class12;

import java.util.Scanner;

public class Calculator1 {
    void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your first number");
        int num1= scanner.nextInt();
        System.out.println("Please enter your second number");
        int num2=scanner.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of these numbers ="+sum);
    }
}
