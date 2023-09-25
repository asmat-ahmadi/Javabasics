package class10;

public class Replit085 {
    public static void main(String[] args)
    {
        int[][] array2D = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        for (int i = 0; i < array2D.length; i += 2) {
            for (int j = 0; j < array2D[i].length; j += 2) {
                sum += array2D[i][j];
            }
        }
        System.out.println( sum);
    }
}
