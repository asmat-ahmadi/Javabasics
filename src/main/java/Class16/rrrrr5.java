package Class16;

public class rrrrr5 {
    public static int countV(String s){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if(ch=='a'|| ch=='e'|| ch=='o'|| ch=='u'|| ch=='i'){
                count++;

            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countV("habibullah a"));
    }
    }


