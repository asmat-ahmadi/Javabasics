import java.util.Scanner;

public class E3NoteOperatorScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name of the country");
        String country= input.nextLine();
        if(!country.equals("China")){ // (!country.equalsignoreCase("China")){ entering data without upper and lower case consderation//
            System.out.println(" Welcome you are allowed");
    }

    }
}
