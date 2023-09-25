package review7;

public class Stringoverview {
    public static void main(String[] args) {
        String phone="Iphone";
        String color=new String();
        color="Yellow";
        String day=new String("thursday");
        String sentence="   Today is September 7   ";
        int size =sentence .length();
        System.out.println(size);
        sentence.trim();
        System.out.println(sentence);
        String[] words=sentence.split(" ");
        System.out.println(words[3]);
       String modified=sentence.replace("Today","tomorrow");
        System.out.println(modified);


    }
}
