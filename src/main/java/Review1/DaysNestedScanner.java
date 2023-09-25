package Review1;

import java.util.Scanner;

public class DaysNestedScanner {
    public static void main(String[] args){
        System.out.println("Choose the day of the week by its number");
        Scanner scan=new Scanner(System.in);
        int day=scan.nextInt();
        if(day==1){
            System.out.println("Sunday");
        } else if ( day==2) {
            System.out.println("Monday");
        } else if ( day==3) {
            System.out.println("Tueday");
        } else if ( day==4) {
            System.out.println("Wednesday");
        } else if ( day==5) {
            System.out.println("Thursday");
        } else if ( day==6) {
            System.out.println("Friday");
        } else if ( day==7) {
            System.out.println("Saturday");



    }else {
            System.out.println(" It is an invalid number of the weekdays");
}}}
