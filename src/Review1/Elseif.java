package Review1;

public class Elseif {
    public static void main(String[] args) {
        String car = "corolla";
        if (car.equals("BMW")) {
            System.out.println("it costs 5000");

        } else if (car.equals("lexus")) {
            System.out.println("it costs 3000");

        } else if (car.equals("corolla")) {
            System.out.println("it costs 6000");

        }else {
            System.out.println(" dont buy other than these cars");
        }
    }
}
