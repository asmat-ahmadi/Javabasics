package class9;

public class homework2Darrays {
    public static void main(String[] args) {
        String [][] list={{"onion","tomato","potato","garlic"},
                {"apple","orage","mingo","kiwi"},
                {"milk","yogurt","chcmilk","butter"},
                {"candy","honey","cake","cookie"}

        };
       // for (int i = 0; i < list.length; i++) {
         //   for (int j = 0; j < list.length; j++) {
            //    System.out.print(list[i][j]+","+ "  ");
// System.out.println();

        for(String [] up :list) {
            for (String j:up){
            System.out.print(j+" ");
        }
            System.out.println();
        }


    }





}
