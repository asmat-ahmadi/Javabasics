package Class15;

public class Cartester {
    public static void main(String[] args) {
        Car c1=new Car("Toyota","Camery","whitel",3500);
        c1.printInfo();
        c1.setprice(30000); // updating price from original
        c1.printInfo();
        System.out.println(c1.getPrice());
    }
}
