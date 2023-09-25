package class22;

public class movAbletester {
    public static void main(String[] args) {
        Movable[] arr = {new Car01(), new Dog01()};
        for (int i = 0; i < arr.length; i++) {
            Movable a = arr[i];
            a.move();
        }
    }
}