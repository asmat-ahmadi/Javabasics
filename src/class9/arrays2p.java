package class9;

public class arrays2p {
                        public static void main(String[] args) {
                         String[][] names =
                        {{"A", "B", "C", "D","E","F"},
                        {"G", "H", "I", "j","K","L"},
                        {"M", "N", "O", "P","Q","R"},
                        {"S", "T", "U", "W","X","Y"},
                        {"Z", "1", "2", "3","4","5"},
                        {"6", "7", "8", "9","10","0","11"},
                        };
                        for (int i = 0; i < names.length; i++) {
                        for (int j = 0; j < names[i].length; j++) {
                        System.out.print(names[i][j]+" ");
                        }
                        System.out.println();
        }
    }}

