package StringmManupulation;

import java.util.Scanner;

public class Scaanerobject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the first four letter of your county");
        String country=input.nextLine();
        if(country.length()>=4){
            String fourl = country.substring(0,4);
            System.out.println("your country first four letters are"+fourl);
        }
        else{
            System.out.println(" your entries are too short");
        }
        input.close();
    }

}
