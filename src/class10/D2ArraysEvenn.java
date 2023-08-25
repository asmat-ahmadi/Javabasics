package class10;

public class D2ArraysEvenn {
    public static void main(String[] args) {
        int [][] num={
                {8,9,1,4,5},
                {6,3,8,9,7},
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
            {
                if(num[i][j] %2==0) {
                    System.out.print(num[i][j] + " ");

                }}
                    System.out.println();


                }}}