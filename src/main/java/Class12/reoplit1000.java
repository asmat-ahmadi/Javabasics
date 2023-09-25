package Class12;

import java.util.Scanner;

public class reoplit1000 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        String reversed="";
        for (int i=s.length()-1; i >=0; i--) {
            reversed += s.charAt(i);

        }
        System.out.println(reversed);

    }
}

