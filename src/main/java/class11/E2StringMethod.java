package class11;

public class E2StringMethod {
    public static void main(String[] args) {
        String str="Batch 17 is great .";
       // for (int i = 0; i < str.length(); i++) { // to count how amny lettr "a" do we have in the sentence
           // System.out.print(str.charAt(i)); //
            int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;

        }

            }
            System.out.println(count);

        }
    }

