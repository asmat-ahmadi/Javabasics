package HmeReviewloopArrays;

import java.util.Scanner;

public class habibasmat2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pick a car out of these cars,Toyota,BMW,Audi");
        String cars=input.nextLine();
        if(cars.equalsIgnoreCase("toyota")){
            System.out.println("this car is reliable");
        } else if (cars.equalsIgnoreCase("BMW")) {
            System.out.println("this car is german");
        } else if (cars.equalsIgnoreCase("Audi")) {
            System.out.println("this car is fast");

        }
        else{
            System.out.println(" that car suck");
        }

    }
}
