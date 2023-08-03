package Review1;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanning = new Scanner(System.in); // This is the main formula for scanner function but scanning is variables
        // and it can be changed anytime but it should match when String function starts like below .
        String age = scanning.next();
        if (age.equals("30")) {
            System.out.println("myage");
        } else {
           // System.out.println(" I dont know you sir");

            if (age.equals("40")) {
                System.out.println("my age after 10 years");
            }else {
                System.out.println(" you are not eligible");
            }



        }
    }
}



