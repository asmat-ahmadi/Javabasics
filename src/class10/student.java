package class10;

public class student {
   // properties/attributes
        String name;
        int age;
        String id;
        // method /function/behaviours
        void study(){            //  void mmeans behaviour
            System.out.println("studying 16 hours a day.......");
    }

    public static void main(String[] args) {
        student ehabObj=new student();
        ehabObj.name="Ehab";
        ehabObj.age=22;
        ehabObj.id="abc123";
        ehabObj.study();  // scanner.nextInt();
        student habibObj=new student();
        habibObj.name="Habib";
        habibObj.age=22;
        habibObj.id="abd123";
        habibObj.study();
    }
}
