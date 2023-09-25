package Review2;

import java.util.Scanner;

public class Ifelseoperation1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please put your age");
        int age= input.nextInt();


        if(age<=25 ){
            System.out.println(" you are teenager");

        }else if( age >=25 && age<=50 ){
            System.out.println("you are adult");
        } else{
            System.out.println("you are old ");
        }

    }
}