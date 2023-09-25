package Projectassignment;

public class CAR {
    private int carPrice;
    private String carColor;

    public CAR(int carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor=carColor;
    }
    double calculateSalePrice(){
        return carPrice;
    }
}

class Truck extends CAR {
    private double weight;

    public Truck(int carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.10;
        } else {
            return super.calculateSalePrice() * 0.20;
        }
    }
}

class Sedan extends CAR {
    private int length;

    public Sedan(int carPrice, String carColor, int length) {
        super(carPrice, carColor);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.05;
        } else {
            return super.calculateSalePrice() * 0.10;
        }
    }
}

class Tester{
    public static void main(String[] args) {
        Truck t1= new Truck(60000,"Grey",4000);
        System.out.println("Truck sale price "+t1.calculateSalePrice());

        Sedan s1= new Sedan(50000,"White",18);
        System.out.println("Sedan sale price "+s1.calculateSalePrice());

    }
}


