package Class16;

public class Replit144 {

    private String label;
    private double price;
    private String catagory;
    private boolean hasExpiration;
    private int stock;


    public Replit144(String label, double price, String catagory, boolean hasExpiration , int stock) {
        this.label = label;
        this.price = price;
        this.catagory = catagory;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public Replit144(String label, double price, int stock) {
        this.label = label;
        this.price = price;
        this.catagory = "misc";
        this.hasExpiration = false;
        this.stock = stock;
    }

    public Replit144(String label, double price) {
        this.label = label;
        this.price = price;
        this.catagory = "null";
        this.hasExpiration = false;
        this.stock = 0;
    }
    public void printinfo(){
        System.out.println(label+" "+price+" "+catagory+" "+hasExpiration+" "+stock);

    }

    public static void main(String[] args) {
        Replit144 Res=new Replit144("eggs",3,"Produce",true,10);
        Res.printinfo();
        Replit144 Res1=new Replit144("paper towels",2,24);
        Res1.printinfo();
        Replit144 Res2=new Replit144("paper towels",2);
        Res2.printinfo();
    }

}