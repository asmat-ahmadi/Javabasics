package ConditionClause;

public class Cond02 {
    public static void main(String[] args) {
        String name="Habibullah";
        String UserName="habib1234";
        String  passWord="abc123450";
        String emailaddress="usthabibi@gmail.com";
        int userName=UserName.length();
        int passcode=passWord.length();
        boolean emailValid=emailaddress.isBlank();
        if(userName>7 && userName<9 && passcode>7 && passcode<9){
            System.out.println("you can login");
        }
        else if (emailValid==false) {
            System.out.println(" you can login");
        }
        else
            System.out.println("you can not login");
}}
