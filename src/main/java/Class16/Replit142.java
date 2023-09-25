package Class16;

public class Replit142 {
    private String name;
    private int batch;
    private int year;
    private String lastdayoftheclass;

    public Replit142(String name1,int batch1,int year1,String lastdayoftheclass1){
        name=name1;
        batch=batch1;
        year=year1;
        lastdayoftheclass=lastdayoftheclass1;

    }
    public  Replit142(){

    }
    public void printinfo(){
        System.out.println(name+" "+batch+" "+year+" "+lastdayoftheclass);
    }

    public static void main(String[] args) {

        Replit142 tech1=new Replit142();
        tech1.printinfo();
        Replit142 tech=new Replit142("Syntax",6,2020,"07/30/2020");

        tech.printinfo();
    }
}
