package class7;

public class E7Nestedloop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
