package Review1;

import java.util.Scanner;

public class assign032 {
    public static void main(String[] args) {
        System.out.println("Is it sunny outside");

        Scanner scan=new Scanner(System.in);
        boolean response=scan.nextBoolean();
        System.out.println(" Is it sunny outside?");
        int temprature=scan.nextInt();
        if (temprature==80){
            System.out.println("It is sunny day, I should go some where");
            System.out.println("what is the temprature");
            System.out.println(" I am going to the beach");


        }else {
            System.out.println(" Is it sunny outside");
            System.out.println("I stay home and study java");
        }



    }
}
