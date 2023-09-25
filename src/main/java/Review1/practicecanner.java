package Review1;

import java.util.Scanner;

public class practicecanner {

    public static void main(String[] args) {
        System.out.println("Pick employees who speaks English");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if (name.equals("Germany")) {
            System.out.println(" He/she is not being picked up");
        } else if ( name.equals("England")) {
            System.out.println("he is eligible to be picked up");

            if (name.equals("Germany")) {
                System.out.println(" He/she is not being picked up");
            } else if ( name.equals("England")) {
                System.out.println("he is eligible to be picked up");
        } else {
            System.out.println(" he nedds to be examined");
        }
    }}}
