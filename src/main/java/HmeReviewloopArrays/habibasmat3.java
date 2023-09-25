package HmeReviewloopArrays;

import java.util.Scanner;

public class habibasmat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (name.equals("Chen")) {
            System.out.println("Teacher");
        } else {
            System.out.println("student");
        }
    }
}