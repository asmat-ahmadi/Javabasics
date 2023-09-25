package class20;

public class E3TypesCasting {
    public static void main(String[] args) {
        Student01 s1 = new Student01("aslan", "A123");
        Student01 s2 = new Student01("javid", "A163");
        Student01[] arr = {new Student01("aslan", "A123"), new Student01("javid", "A2334")};
        arr[1].printInfo();
        arr[0].printInfo();
        for (int i = 0; i < arr.length; i++) {
            Student01 s = arr[i];
            s.printInfo();

            int num = (int) 12.5;
            System.out.println(num);
            double age = 10;
            Animal a = new Animal();

        }
    }
}
