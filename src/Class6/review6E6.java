package Class6;

import java.util.Scanner;

public class review6E6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Scanner scammer = new Scanner(System.in);
            System.out.println("Please enter the name of the Fruit");
            String fruit = scammer.next();

            switch (fruit) {
                case "Orange":
                    System.out.println("It is usually Orange");
                    break;
                case "Banana":
                    System.out.println("Yellow Banana are good");
                    break;
                case "Strawberry":
                    System.out.println("I like Red Strawberrys");
                    break;
                case "blueberry":
                    System.out.println("Blue berries are very heart");
                    break;
                default:
                    System.out.println("i dont like this fruit");
            }
        }
    }}
