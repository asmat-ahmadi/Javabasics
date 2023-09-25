package Class12;

import java.util.Scanner;

public class replit105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char vowels=word.charAt(i);
            if("a,i,o,u,e".contains(String.valueOf(vowels))){
                System.out.println(vowels);

            }

        }
    }

}
