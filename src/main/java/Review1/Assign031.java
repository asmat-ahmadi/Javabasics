package Review1;

import java.util.Scanner;

public class Assign031 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it sunny outside");
        Boolean isSunny=scanner.nextBoolean();
        if(isSunny){
            System.out.println("It is sunny day , I should go somewhere");
            System.out.println("What is the temprature outside?");
            int temprature=scanner.nextInt();
                if(temprature<85){
                    System.out.println("I am going to the beach");
                }else
                    System.out.println("I am going to the park");
                }else {
                    System.out.println(" I stay home and practice Java");
                }
            }
        }


