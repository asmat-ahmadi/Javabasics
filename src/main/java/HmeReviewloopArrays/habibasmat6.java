package HmeReviewloopArrays;

import java.util.Scanner;

public class habibasmat6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Is it sunny outside");
        boolean weather=input.nextBoolean();
        System.out.println("what is the temprature outside");
        int temp= input.nextInt();
        if(weather){
            System.out.println("It is a sunny day,I should go somewhewre");


        }else{
            System.out.println(" I stay hone and practice java");
        }
         if(temp>=85){
            System.out.println(" iam going to beach");


        }
         else{
             System.out.println(" I am going to the park");
         }

    }
}
