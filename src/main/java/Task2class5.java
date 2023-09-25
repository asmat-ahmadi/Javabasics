import java.util.Scanner;

public class Task2class5 {
    public static void main(String[] args) {
        System.out.println("enter your height");
        Scanner input=new Scanner(System.in);
        int height= input.nextInt();

          if( height<60){
              System.out.println("short");

          }else if (height>=60 && height <=72){ // = means that 72 includes medium not tall
              System.out.println("medium");
          }else{
              System.out.println("Tall");
          }
    }
}
