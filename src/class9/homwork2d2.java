package class9;

public class homwork2d2 {
    public static void main(String[] args) {
        int [][] list={
                {23,54,78},
                {54,35,24,},
                {14,57,88}

        };
        int sum=0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {

                sum=sum+list[i][j];
            }
        }
        System.out.print(sum+"  ");
    }
}
