package Syntaxproject;

public class projEX {
    public static void main(String[] args) {
      String N="love";
      String M="hate";
      N=N+M;
      M=N.substring(0,N.length()-M.length());
      N=N.substring(M.length());

        System.out.println(N+" "+M);
      //  System.out.println(N);
    }
}
