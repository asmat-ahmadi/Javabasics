package Review1;

import java.util.Scanner;

public class naturenestedScanner {
    public static void main(String[] args){
        System.out .println("The current nature is");
        Scanner scan=new Scanner(System.in);
        int temprature=scan.nextInt();
        if(temprature>90){
            System.out.println(" It is summer and very hot");
            System.out.println(" we should go to beach");

        } else if( temprature>70){
            System.out.println(" it is spring and noraml");
            System.out.println(" we should go to park for a BBQ");
        }else if(temprature <40){
            System.out.println(" It is winter and very cold");
            System.out.println(" We should stay home and watch movies");
        }else{
            System.out.println(" do nothing ");
        }
    }

}
