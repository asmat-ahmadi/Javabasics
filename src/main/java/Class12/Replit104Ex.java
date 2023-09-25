package Class12;

import java.util.Scanner;

public class Replit104Ex {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first 3 letters of a word");
        String [] names=new String[5];

        for (int i = 0; i< names.length; i++) {
            names[i]=scanner.nextLine();
            if (names[i].length()>=3){
                String subname = names [i].substring(0, 3);
                System.out.println(subname);

        }

        }
    }
}
























