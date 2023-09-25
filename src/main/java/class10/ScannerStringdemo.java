package class10;

import java.util.Scanner;

public class ScannerStringdemo {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your username");
        String usern=input.nextLine();
        System.out.println("plrsse enter your passcode");
        String passcode=input.nextLine();
        System.out.println("please confirm your passcode");
        String confirmP=input.nextLine();
        if(usern.isEmpty()|| passcode.isEmpty()){
            System.out.println("your user and passcode can not be empty");
        }else if (passcode.length()<9) {
            System.out.println("Your passcode is too short");
        } else if (usern.equals(usern)){
            System.out.println("Passcode can not contain username");
        }else if(confirmP.matches(passcode)){
            System.out.println("passcode do not match");

        }else{
            System.out.println("you have successfully");
        }



        }}
