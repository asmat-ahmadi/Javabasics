package Review1;

import java.util.Scanner;

public class Whileoepration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= "";
      /*  while(name.isBlank()){
            System.out.println("Enter your name");
            name= scanner.nextLine();
        }
        System.out.println("hello brother");*/
      do {
          System.out.println("Enter your name");
          name = scanner.nextLine();
      }while(name.isBlank());

        System.out.println("hello "+name);
    }}

