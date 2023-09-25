package Review1;

import java.util.Scanner;

public class assgn029 {
    public static void main(String[] args) {
        System.out.println("please enter first number");
        System.out.println("Please enter second number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int result=(num*num);
        if(result>0){
            System.out.println("true");

        }else {
            System.out.println("false");
        }

    }
}
