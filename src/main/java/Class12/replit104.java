package Class12;

import java.util.Scanner;

public class replit104 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first 3 letters of a word");
        String letter=scanner.nextLine();

        if (letter.length() >= 3) {
            String threel = letter.substring(0, 3);
            System.out.println(threel);
        } else {
            System.out.println("The name is too short to get the first three letters.");
        }
    }
}
























