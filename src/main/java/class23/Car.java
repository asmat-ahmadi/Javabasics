package class23;

public class Car {
    public String model;
    public String make;
    public int year;
    public Car(String model,String make,int year){
        this.model=model;
        this.make=make;
        this.year=year;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make) {
        this.make = make;




    }}
class Main001{
    public static void main(String[] args) {
        Car C=new Car("Toyota","Japan",2022);

        C.setModel("Nissan");
        C.setMake("Germany");

        System.out.println("model"+C.getModel());
        System.out.println("model"+C.make);
    }
}