package Class12;

import java.util.Scanner;

public class SubtractionM {
    void sub(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please subtract your first number");
        int num1=scanner.nextInt();
        System.out.println("Please subtract your second number");
        int num2=scanner.nextInt();
        int sum=num1-num2;
        System.out.println("The total number of your subtraction is "+sum);
        if(sum% 2==0){
            System.out.println("It is an even total of subtration");

        }
        else if (sum%2!=0){
            System.out.println( " your total number of subtraction is odd");
        }
        else if (sum<0){
            System.out.println(" It is a negative number");
        }


        else
            System.out.println("It is invalid characters");
        }
        //void multiple(int num3,int num4){ // This way is called parameter or input
        void multiple(){
        int num3=10;
       int num4=20;
        int sum=num3*num4;
            System.out.println("your total multiplication is "+sum);
        }
        void natinalitt(){
        Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter your country");
            String country= scanner.nextLine();
            if(country.equalsIgnoreCase("Japan") || country.equalsIgnoreCase("Germany")|| country.equalsIgnoreCase("Spain")){
            System.out.println(" You are allowed to enter to USA");
        }
        else{
                System.out.println("You are not allowed to enter to USA");

    }


    }}

