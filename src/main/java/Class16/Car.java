package Class16;

public class Car {
    String name;
    String model;
    String make;
    int year;

    public Car(String name1, String model1, String make1, int year1) {
        name = name1;
        model = model1;
        make = make1;
        year = year1;
        //  public Car(String name,String model,String make,int year){
        //   this.name=name;
        //  this.model=model;
        // this.make=make;
        //  this.year=year;
         }
        public void printinfo () {
            System.out.println("1.car name: " + name + " 2.car model name: " + model + " 3.car make " + make + " 4.car year " + year);

        }
    }




