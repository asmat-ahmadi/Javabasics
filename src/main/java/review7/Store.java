package review7;

public class Store {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.title="Nightwork";
        book1.author="Irwin Shaw";
        book1.year=1975;
        book1.price=45;
        book1.read();
        book1.changeofprice(41);
        double total= book1.totalTax(0.1);
        System.out.println("the price wth taxes="+total);


    }
}
