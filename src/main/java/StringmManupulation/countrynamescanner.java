package StringmManupulation;

import java.util.Scanner;

public class countrynamescanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of your country: ");
        String country = input.nextLine();

        if (country.length()>= 4) {
            String fourLetters = country.substring(0, 4);
            System.out.println("The first four letters of your country are: " + fourLetters);
        }else {

            System.out.println("Your country name is too short. It should be at least four letters long.");
        }


    }
}



