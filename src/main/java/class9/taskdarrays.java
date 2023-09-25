package class9;

public class taskdarrays {
    public static void main(String[] args) {
        String[][] studnets = {
                {"Ayesha", "guila", "jon", "deepali"},
                {"A", "A+", "C", "B"}
        };

        for (int i = 0; i < 4; i++) {
            if(studnets[1][i].equals("A") || studnets[1][i].equals("B")){
            System.out.println(studnets[0][i]);
        }


    }}}
