package class9;

public class E22dArrays {
    public static void main(String[] args) {
        String[][] names =
                {{"Hind", "miakial", "Ismail", "Ahmadi"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "laugh", "jon ahmad", "mohammad"},
                        {"gui", "bekaon", "front", "API"}
                };
        String[] row=names[1];
        //System.out.println((names[0][2]));
       for(String name:row){
           System.out.println(name);
       }
    }


    }

