package Review1;

import java.util.Scanner;

public class Switchpr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        int carOrigin= input.nextInt();
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


        }
    }
}
