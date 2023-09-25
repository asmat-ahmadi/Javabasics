import java.util.Scanner;

public class Task4class5 {
    public static void main(String[] args) {

            System.out.println("which day of the week is this?");
            Scanner input=new Scanner(System.in);
            int number=input.nextInt();

            if(number>=1 && number<=10){
                System.out.println(" small");

            }else if (number<=11 && number<=100){
                System.out.println("small");
            }else if (number<=101 && number<=1000){
                System.out.println("medium");
            }else{
                System.out.println("large");
            }

        }
    }


