package StringmManupulation;

public class FivebasicStringmanupulations {
    public static void main(String[] args) {
        String name="HABIBULLAH AHMADI";      // CHANGE IT TO LOWERCASE                           1
        System.out.println(name.toLowerCase());

        String name1="habibullah ahmadi";         // change to lower case                          2
        System.out.println(name1.toUpperCase());

        String name2="Habibullah ahmadi";          // find out the total number of characters      3
        System.out.println(name2.length());

        String substring=name.substring(0,10);  // to print out specific part by indexes numbers   4
        System.out.println(substring);
        String substring1=name.substring(10,17);
        System.out.println(substring1);

        String given="Habibullah Ahmadi";      // to replace one thing to another one              5
        String rep=given.replace("Habibullah","Asmatullah").replace("Ahmadi","Sayem");
        System.out.println(rep);

        String name3="Habibullah Ahmadi";      // this command reverse any letter and number       6
        for (int i = name3.length()-1; i>0; i--) {
            System.out.print(name3.charAt(i));
        }
        String na= "Habibullah Ahmadi";       // to find the inderx of letter by indexof           7
        System.out.println(na.indexOf("h"));
        System.out.println(na.indexOf(" "));
        System.out.println(na.indexOf("d"));
        System.out.println(name.indexOf("."));




    }
}
