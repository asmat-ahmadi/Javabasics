package Review2;

import java.util.Scanner;

public class replit041 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the roll number of the child");
        int age= input.nextInt();
        switch (age){
            case 101:
                System.out.println("Ramesh");
                break;
            case 102:
                System.out.println("Mahesh");
                break;
            case 103:
            System.out.println("Mukesh");
            break;

            default:
                System.out.println("Not found student name");


        }
    }
}
