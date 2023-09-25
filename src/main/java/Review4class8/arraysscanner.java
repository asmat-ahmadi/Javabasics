package Review4class8;

import java.util.Arrays;
import java.util.Scanner;

public class arraysscanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please entre the size of arrays");
        int size=input.nextInt();
        int [] numbers=new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("please enter the numbers");
            numbers[i]=input.nextInt();
        }
        System.out.println("please entered these numbers");
        System.out.println((Arrays.toString(numbers)));
    }
}
