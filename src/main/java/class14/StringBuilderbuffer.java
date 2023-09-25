package class14;

public class StringBuilderbuffer {
    public static void main(String[] args) {
        //String str11="habib";
       // str11.concat("ahmadi");
        StringBuilder strR=new StringBuilder("habib"+" ");
        strR.append("ahmadi");
        System.out.println(strR);

        String Rev="I am Syntax java student";
        StringBuilder rev1=new StringBuilder("I am Syntax java student");
        rev1.reverse();            // reverse the whole sentence with their positions
        System.out.println(rev1);

        String Rev2="I am Syntax java student";
        String [] array=Rev2.split(" "); // This way will index by word with loop
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i]+" ");
        }







    }
}
