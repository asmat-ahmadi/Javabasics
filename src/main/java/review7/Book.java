package review7;

public class Book {
    String title;
    String author;
    int year;
    double price;
    void read(){
        System.out.println(" I am reading"+title+"book by"+author);
    }
    void changeofprice(int newPrice){
        System.out.println("The price of the book"+title+"was changed from"+price+"newPrice");
    }
    double totalTax(double tax){
        double total=price+(price*tax);
        return total;

    }
}
