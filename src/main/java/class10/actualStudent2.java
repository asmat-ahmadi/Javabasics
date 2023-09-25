package class10;

public class actualStudent2 {
    public static void main(String[] args) {
        Student2 actualSt=new Student2();
        actualSt.name="habib";
        actualSt.age=45;
        actualSt.occupation="manager";
        actualSt.ID="NBC22";
        System.out.println(actualSt.name);
        System.out.println(actualSt.age);
        System.out.println(actualSt.occupation);
        System.out.println(actualSt.ID);
        actualSt.work();
        actualSt.exercise();
        actualSt.run();
        actualSt.watch();

    }
}
