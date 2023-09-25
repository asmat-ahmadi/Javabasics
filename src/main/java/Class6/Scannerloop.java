package Class6;

import java.util.Scanner;

public class Scannerloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start=scanner.nextInt();
        System.out.println("please enter the ending point");
        int end =scanner.nextInt();
        System.out.println("pleae enter the step");
        int step=scanner.nextInt();
        while(start <=end){
            System.out.print(start);
            start+= step;

        }
    }
}


