package class9;

public class homwork2D4 {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Canada", "Green land", "Mexico"},
                {"Brazil", "Chile"," Argentina","Peru"},
                {"German", "Italy", "France ", "UK"},
                {"China", "Japan", "Korean", "India"},
                {"Morocco", "Sudan", "Jamaica ", "South Africa"},

        };
        int count=0;
        for( String [] break1:countries){
            for (String break2:break1){
                System.out.print(break2+" ");
                count=count+=1;
            }
            System.out.println();
            }
        System.out.println("total country number is equal to "+count);
        }


        }


