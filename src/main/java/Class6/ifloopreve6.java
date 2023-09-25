package Class6;

import java.util.Scanner;

public class ifloopreve6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 1;
        double sum = 0;
        do {
            System.out.println("please enter your item price ");
            x = scanner.nextDouble();
            if(x !=-1){

                sum = sum + x;}
                System.out.println("your total purchase is " + sum);
            } while(x!=-1);

        }
    }