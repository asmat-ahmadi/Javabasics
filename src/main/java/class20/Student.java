package class20;

public class Student {


    void Read() {
        System.out.println("Read book everyday");
    }
    void Reviewlesson() {
        System.out.println("Studnet review reularly");
    }
    void complete() {
        System.out.println("Student needs to complete assignment");
    }
}
    class SyntaxStudent extends Student{
        @Override
        void Read(){
            System.out.println("read hard but no focus on concept");

        }}
        class CollegeStudent extends Student{
            @Override
            void Read(){
                System.out.println("no reading at all ");
    }
        }
class SchooStudnet extends Student{
    @Override
    void Read() {
        System.out.println("reading too slowly");
    }}