package class13;

public class replit117xx {
    public static double evenN(double x){
        double sum=0;
        for (int i = 0; i <=x; i++) {
            if(i % 2==0){
                sum+=i;

            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenN(8.2));
        System.out.println(evenN(5.5));
    }
}
