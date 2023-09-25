package Class6;

import java.util.Scanner;

public class Review6Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String carOrigin= input.nextLine();

        System.out.println("Your favorite car is");
        switch (carOrigin){
            case "BMW":
                System.out.print("german car");
                break;
            case "toyota":
                System.out.print("Japanes car");
                break;
            case "Maserati":
                System.out.print("Italianc ar");
                break;
            default:
                System.out.print("unknown");

    }
}}
/*
Scanner input=new Scanner(System.in);

        int carOrigin= input.nextInt();

        System.out.println("Your favorite car is");
        switch (carOrigin){
            case 1:
                System.out.println("BMW");
                break;
            case 2:
                System.out.println("toyota");
                break;
            case 3:
                System.out.println("Maserati");
                break;
            default:
                System.out.println("Unknown");
 */