package class10;

public class Projecttask04revised {
    public static void main(String[] args) {
        int[][] num = {
                {8, 6, 7, 3, 1, 4, 5},
                {9, 8, 7, 2, 5, 6, 9},
        };
        int sumeven=0;
        int sumodd=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    sumeven+=num[i][j];
                }if(num[i][j] % 2 != 0) {
                    sumodd+=num[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("The total sum of the even elements is "+sumeven);
        System.out.println("The toral sum of the odd elements is "+sumodd);
    }

}
