package class10;

public class StringDemo01 {
    public static void main(String[] args) {
       String name="habibullah";
       if(name.length()<=8){
           System.out.println("you can proceed");
       }
       else{
           System.out.println("not allwoed to enter less than 10");
       }
        System.out.println(name.length());
    }
}
