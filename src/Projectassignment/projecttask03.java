package Projectassignment;

public class projecttask03 {
    public static void main(String[] args) {
        int[][] num = {
                {6, 7, 9, 6, 9, 8, 4, 2},
                {8, 9, 6, 8, 4, 2, 9,1},
        };

            for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++){



               if(num[i][j] % 2  ==0){
                   System.out.print(num[i][j]+" ");
                }

                }
                System.out.println();
            }
        }

}

