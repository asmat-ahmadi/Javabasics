package OVERVIEWPlesson;

import java.util.Scanner;

public class Nestedloop01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the startpoint");
        int startpoint=scanner.nextInt();
        System.out.println("please enter the end point");
        int endpoint= scanner.nextInt();
        System.out.println("please enter the steps");
        int steps= scanner.nextInt();
       // for( int i=startpoint;i<=endpoint;steps+=startpoint);
        while(startpoint <=endpoint){
        startpoint+=steps;
            System.out.print(startpoint+" ");

        }

    }
}


