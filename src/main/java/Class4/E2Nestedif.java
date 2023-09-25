package Class4;

public class E2Nestedif {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketcolor="black";
        if(winter==true) {
            System.out.println("it is very cold");

            if(jacketcolor.equals("red")){
                System.out.println("lets go with red nike shoes");
            } else {
                System.out.println("lets go with blue ones");
            }
        } else {

            System.out.println("no need to wear jackets");
        }
    }
}
