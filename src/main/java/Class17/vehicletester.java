package Class17;

public class vehicletester {
    public static void main(String[] args) {
        Nissan N=new Nissan();
        N.model="NissanP";
        N.make="Japan";
        N.year=1995;
        N.luxury=false;
        N.printInfo();

        Toyota T=new Toyota();
        T.model="Luxus";
        T.make="Japan";
        T.year=1999;
        T.luxury=true;
        T.printInfo();
        Honda H=new Honda();
        H.model="Acura";
        H.make="Japan";
        H.year=1998;
        H.luxury=true;
        H.printInfo();
    }

}
