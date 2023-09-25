package Syntaxproject;
 public class Car {
 private double salesprice;
 public String color;
 public Car(double salesprice,String color){
     this.salesprice=salesprice;
     this.color=color;
 }
 double calculateSalesP(){
     return salesprice;

 }
 }
class Truck extends Car{
     private double weight;
     public Truck(double salesprice,String color,double weight){
         super(salesprice,color);
         this.weight=weight;

     }
     @Override
    double calculateSalesP(){
         if(weight>2000){
             return super.calculateSalesP() * 0.10;
         }else {
             return super.calculateSalesP() * 0*20;
         }
     }
}
class Sedan extends Car{
    private double length;
    public Sedan(double salesprice,String color,double length) {
        super(salesprice, color);
        this.length = length;
    }
        @Override
        double calculateSalesP() {
            if (length > 20) {
                return super.calculateSalesP() * 0.05;

            } else {
                return super.calculateSalesP() * 0.10;
            }
        }
    }
    class tester{
        public static void main(String[] args) {
            Truck tp=new Truck(6000,"silver",4000);
            System.out.println("sales price: "+tp.calculateSalesP());
            Sedan sp=new Sedan(5000,"red",18);
            System.out.println("sale price: "+sp.calculateSalesP());
        }
    }