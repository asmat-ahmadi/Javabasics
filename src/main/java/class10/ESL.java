package class10;

public class ESL {
    String name;
    String country;
    double price;

    public static void main(String[] args) {
        ESL product=new ESL();
        product.name="banana";
        product.country="Germany";
        product.price=99.99;
        System.out.println(" the name of the product is "+product.name+" and it imported from "+ product.country+ " and the price of each box is "+ product.price);
    }
}
