package Class4;

public class E3nestedif {
    public static void main(String[] args) {
        double accountbalance=150000;
        if(accountbalance>28000) {
            System.out.println("we can afford a normal toyota");
            if(accountbalance>50000){
                System.out.println("we can can also afford luxury cars as weel");
            }
        } else {
            System.out.println("we need to save more");
        }
        }
}
