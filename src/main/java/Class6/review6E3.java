package Class6;

import java.util.Scanner;

public class review6E3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your first boolean value true/false");
        boolean var1=scanner.nextBoolean();
        System.out.println("Pelase enter your second boolean vlaue true/false");
        boolean var2=scanner.nextBoolean();

        if(var1&&var2){

            System.out.println("both value are true");

    }else {
            System.out.println("Both vlause ae not true");
        }
}}
