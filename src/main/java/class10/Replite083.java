package class10;

public class Replite083 {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2},
                {3,1,2},
                {3,5,3},
                {0,1,2}
        };
        for(int i=0;i< a.length;i++){
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                sum+=a[i][j];
            }
            System.out.println((i+1)+": "+sum);
        }

    }

}

