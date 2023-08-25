package class9;

public class E9garrays {
    public static void main(String[] args) {
        String[][] names =
                {{"Hind", "miakial", "Ismail", "Ahmadi"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "laugh", "jon ahmad", "mohammad"},
                        {"gui", "bekaon", "front", "API"}
                };
        for(String [] row:names){
            for(String v: row){
                System.out.print(v+" - ");
            }
            System.out.println();
        }

    }
}
