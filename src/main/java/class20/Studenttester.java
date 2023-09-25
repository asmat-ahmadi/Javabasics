package class20;

public class Studenttester {
    public static void main(String[] args) {
        Student [] arr={new Student(),new SyntaxStudent(),new CollegeStudent(),new SchooStudnet()};
        for (int i = 0; i < arr.length; i++) {
            arr [i].complete();
            arr[i].Read();
            arr[i].Reviewlesson();

        }
    }
}
