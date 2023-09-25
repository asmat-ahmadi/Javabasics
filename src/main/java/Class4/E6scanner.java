package Class4;

import java.util.Scanner;

public class E6scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your gender");
        char gender=scanner.next().charAt(2);// takes the first letter of any wording and forget the rest like Male=M
        System.out.println("your gender is "+gender);

    }
}
