package Class6;

public class E5whileloop {
    public static void main(String[] args) {
        int i=5;
        while(10>=i){
                                      // if we put i++ above the Sout then it includes ( 10) in the sequential.//
            System.out.println(i);          // if we put in both places it shows only even number//
            i++;                           // if we put after Sout it doesnt show (10) number in sequential //
        }                                  // if we remove the i++ and repeat for ever
                                           // if the int is odd then the both i++ shows even in revers way
    }
}
