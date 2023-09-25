package class13;

public class replit118x {
    public static String space1(String x){
        StringBuilder space2=new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            space2.append(x.charAt(i));
            if(i < x.length()-1){
                space2.append(" ");

            }


        }
        space2.append(" ");
        return space2.toString();
    }

    public static void main(String[] args) {
        System.out.println(space1("Ahmadi"));
        System.out.println(space1("Habibullah"));
    }
}
