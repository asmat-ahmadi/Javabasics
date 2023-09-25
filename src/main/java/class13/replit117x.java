package class13;

public class replit117x {
    public static int odd(int Y){
        int sum=0;
        for (int i = 0; i <=Y; i++) {
            if(i % 2!=0){
                sum+=i;


        }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(odd(9));
        System.out.println(odd(5));
    }
}
