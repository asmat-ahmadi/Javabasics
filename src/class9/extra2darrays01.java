package class9;

public class extra2darrays01 {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Canada", "Green land", "Mexico"},
                {"Brazil", "Chile", " Argentina", "Peru"},
                {"German", "Italy", "France ", "UK"},
                {"China", "Japan", "Korean", "India"},
                {"Morocco", "Sudan", "Jamaica ", "South Africa"},
        };
char letter='c';
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
               String country =countries[i][j];
                if (country.regionMatches(true, 0, String.valueOf(letter), 0, 1)) {
                System.out.println(countries[i][j] + " ");
            }

        }

    }}}

