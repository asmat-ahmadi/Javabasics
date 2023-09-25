package class20;

public class InstructorT {
    public static void main(String[] args) {
        instructor ins= new instructor("habib","Ab5656");
        instructor ins1= new instructor("hasib","AC5656");
        instructor [] arry={new instructor("habib","Ab5656")
                ,new instructor("hasib","AC564")};

       // arry[1].printinfo();
       // arry[0].printinfo();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10; j++) {
                instructor s1=arry[i];
                s1.printinfo();
            }

        }
        }}



