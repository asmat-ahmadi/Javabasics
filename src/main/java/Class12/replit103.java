package Class12;

import java.util.Scanner;

public class replit103 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char letter=s.charAt(i);
            System.out.print(letter+" ");
        }

        }
}
