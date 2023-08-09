package Review2;

import java.util.Scanner;

public class Replit040 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of the instructor");
        String instructorN= input.nextLine();
        switch (instructorN){
            case "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case "Mazzom":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case "salim":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case "habib":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                System.out.println("Invalid instructor selected");

        }

    }
}
