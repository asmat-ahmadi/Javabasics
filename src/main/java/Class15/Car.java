package Class15;
// object of the class bellow

public class Car {
   private String make;
   private String model;
    private String color;
    private double price ;
    //no data type in here just the name of class
    // Public is good for constructor
    public Car(String cMake,String cModel,String cColor,double cPrice){  // the parameter of of the construct class
        make=cMake;
        model=cModel;
        color=cColor;
        price=cPrice;



    }
void printInfo(){
    System.out.println(make+" "+model+" "+color+" "+price);
}
void setprice(double cPrice){
        price=cPrice;
}
double getPrice(){
        return price;

}
}
