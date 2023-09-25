package class18;

public class Car {
    String make;
    String model;
    double price;
    String color;
    // lets create constructor to ease and control our coding //

        public Car(String make,String model,double price,String color) {
            this.make = make;
            this.model = model;
            this.price = price;
            this.color = color;
        }

    void info(){
        System.out.println(make+" "+model+" "+price+" "+color);
}

}

class BMW extends Car{
    public BMW(String make,String model,double price,String color){

        super(make,model,price,color);
       // this.make=make;
       // this. model=model;
       // this.price=price;
       // this.color=color;

        }}
class Audi extends Car{
    public Audi (String make,String model,double price,String color) {
        super(make,model,price,color);
        //this.make = make;
        //this.model = model;
       // this.price = price;
       // this.color = color;

    }}


