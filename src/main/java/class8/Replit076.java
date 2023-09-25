package class8;

import java.util.Scanner;

public class Replit076 {
    public static void main(String[] args) {
           String []  days=new String[7];
           Scanner input=new Scanner(System.in);
        for (int i = 0; i <7; i++) {
            System.out.println("Please enter day "+(i+1)+"  of the week");
            days[i]=input.next();

        }
        for (int i = 0; i < 7; i++) {
            System.out.println(days[i]);

        }                                      //System.out.println("Please entr the size of the arrays");
    }
}
