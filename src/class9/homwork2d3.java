package class9;

public class homwork2d3 {
    public static void main(String[] args) {
        int [][] num={
                {12,54,73,21},
                {43,90,65,10},
                {64,23,12,78},
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j] %2==0){
                    System.out.print(num[i][j]+" ");
                }
            }
            System.out.println();
        }
    }}

