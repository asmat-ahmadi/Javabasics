package class10;

public class main {
    String carcolor;
    String carMake;
    int caryear;

    public static void main(String[] args) {
        main car001=new main();
        car001.carcolor="black";
        car001.carMake="BMW";
        car001.caryear=1999;
        main car002=new main();
        car002.carcolor="White";
        car002.carMake="Toyota";
        car002.caryear=2000;
        System.out.println("car color is  "+car001.carcolor+" and car year is "+car001.caryear+ " and car make is "+car001.carMake);
        System.out.println("car color is  "+car002.carcolor+" and car year is "+car002.caryear+ " and car make is "+car002.carMake);

    }



    }

