import java.util.Scanner;

public class Tsskclass5 {
    public static void main(String[] args) {
        System.out.println("Please enter your birth month");
        Scanner input=new Scanner(System.in);
        String month= input.nextLine();
        if(month.equals("June")|| month.equals("july")||month.equals("August")) {
            System.out.println("you were born in summer season");
        } else if(month.equals("March")|| month.equals("April")||month.equals("May")){
            System.out.println(" you were born in spring season");
        }else if(month.equals("November")|| month.equals("december")||month.equals("january")){
            System.out.println(" you were born in winter season");
    } else {
            System.out.println(" you were born in fall season");
}
    }}