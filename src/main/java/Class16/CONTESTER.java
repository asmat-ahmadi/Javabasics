package Class16;

public class CONTESTER {
    private  CONTESTER(){
        System.out.println("private");


    }
    CONTESTER(String name){
        System.out.println("defalut");
    }
    protected  CONTESTER(int age ){
        System.out.println("protected");

    }
    public CONTESTER(double weight){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new CONTESTER();
        new CONTESTER("habib");
        new CONTESTER(45);
        new CONTESTER(3.4);
    }
}
