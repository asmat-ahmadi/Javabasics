package Review1;

import java.util.Scanner;

public class Homework {
    /*Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your hour");
        int hour= input.nextInt();
        if(hour>=1&& hour<=11){
            System.out.println("Morning");

        }else if (hour>=12 && hour <=15){
            System.out.println("Afternoon");
        }else if (hour>=16 && hour <=20){
            System.out.println("Evening");

        }else {
            System.out.println("night");
        }
    }
}
