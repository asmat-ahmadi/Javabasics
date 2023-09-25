import java.util.Scanner;

public class Task3class5 {
    public static void main(String[] args) {
        System.out.println("which day of the week is this?");
        Scanner input=new Scanner(System.in);
        int weekday=input.nextInt();

        if(weekday>=1 && weekday<=5){
            System.out.println(" It is week day");

        }else if (weekday<=6 && weekday<=7){
            System.out.println("weekdend day");

        }else{
            System.out.println("invalid");
        }

    }
}
