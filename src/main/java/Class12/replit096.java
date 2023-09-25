package Class12;

import java.util.Scanner;

public class replit096 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter string value");
        String language=scanner.nextLine();
        if(language.equals("Java")){
            System.out.println("Java is a programming language");
        }
        else if(language.equals("C")){
            System.out.println("C is a procedural programming language");
        }
        else if(language.equals("C++")){
            System.out.println("C++ is a middle-level programming language");

        }
        else
        System.out.println("Doesnt match any programming language");
    }
}
