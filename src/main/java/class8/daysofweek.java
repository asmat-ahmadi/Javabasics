package class8;

public class daysofweek {
    public static void main(String[] args) {
        String []num={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int weeks=2;
        int day=7;
        for (int i = 1; i < weeks; i++) {
            System.out.println(num[i] +i);
            for (int j = 1; j < num.length; j++) {
                System.out.println(num[j] +j);

            }

        }
    }

}

