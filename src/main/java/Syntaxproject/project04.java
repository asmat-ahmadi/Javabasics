package Syntaxproject;

public class project04 {
    public static void main(String[] args) {
// how to get the total number of the word in a sentence.
        var word="hello world";
        String [] wordList=word.split(" ");

        var count=0;
        for (int i = 0; i < wordList.length ; i++) {

            count++;
        }
        System.out.println(count);

    }
}



