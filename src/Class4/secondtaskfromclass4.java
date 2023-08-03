package Class4;

public class secondtaskfromclass4 {
    public static void main(String[] args) {
        double mortgagerate=4.3;
        double price=40000;
        if (mortgagerate>4.1) {
            System.out.println(" user will not buy a house");
        }else {
            System.out.println("will buy the house");
            if (price>50000){
                System.out.println("the user will take a loan");
            }else {
                System.out.println("user will pay cash");
            }
        }
    }
}
