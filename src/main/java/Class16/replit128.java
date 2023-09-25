package Class16;

public class replit128 {
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);
    }
    public static String mixString(String firstValue,String secondValue) {
        StringBuilder mixString = new StringBuilder();
        int length = firstValue.length();
        for (int i = 0; i < length; i++) {
            mixString.append(firstValue.charAt(i));
            mixString.append(secondValue.charAt(i));


        }
        return mixString.toString();
    }
}
