package class20;

public class country {
    String name;
    int population;
    public country(String name,int population){
        this.name=name;
        this.population=population;
    }
}
class Capital1 extends country{
    String capital;
    public Capital1(String name, int population,String capital) {
        super(name, population);
        this.capital=capital;

    }
    void print(){
        System.out.println(name+" "+population+" "+capital);
    }
    }
    class location extends country{
    String location1;



        public location(String name, int population,String location1) {
            super(name, population);
            this.location1=location1;
        }
        void print(){
            System.out.println(name+" "+population+" "+location1);
        }
    }

class tester01{
    public static void main(String[]args){
        Capital1 c1=new Capital1("Afghanistan",3500000,"Kabul");
        location l1=new location("America",35000000,"Asia");
        c1.print();
        l1.print();


        }
    }
