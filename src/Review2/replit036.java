package Review2;

import java.util.Scanner;

public class replit036 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String blue=input.nextLine();
        String black=input.nextLine();
        System.out.println("Please enter two numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(blue.equals(black) && num1==num2){
            System.out.println("And");

        }else if(num1==num2 || blue .equals(black)){
            System.out.println("OR");

        }else {
            System.out.println("None");
        }

    }
}
