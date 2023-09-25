package Class12;

import java.util.Scanner;

public class Replit097 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your browser");
        String browser=input.nextLine();

        if(browser.equals("Chrome") || browser.equals("CHROME")|| browser.equals("ChRoMe")){
            System.out.println("Proceed with chrome browser");
        }

        else if(browser.equals("firefox") || browser.equals("FIREFOX")|| browser.equals("FireFOX")){

            System.out.println("Proceed with Firefox browser");
    }

        else if(browser.equals("IE") || browser.equals("ie")|| browser.equals("iE")){
            System.out.println("Proceed with IE browser");
        }

        else {

            System.out.println("Invalid browser");
        }


}}
