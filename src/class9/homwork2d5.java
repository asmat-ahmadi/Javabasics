package class9;

public class homwork2d5 {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Canada", "Green land", "Mexico"},
                {"Brazil", "Chile", " Argentina", "Peru"},
                {"German", "Italy", "France ", "UK"},
                {"China", "Japan", "Korean", "India"},
                {"Morocco", "Sudan", "Jamaica ", "South Africa"},
        };
        int count=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                count=count+=1;
                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }
       System.out.println("total county number is "+count);
    }}
