package ConditionClause;

public class Cond01 { // if the length of the User and password is matching you can login if not you cant
    public static void main(String[] args) {
    String name="Habibullah";
    String UserName="habib1234";
    String  passWord="abc123450";
    String emailaddress="usthabibi@gmail.com";
    int userName=UserName.length();
    int passcode=passWord.length();

    if(userName>=7 && userName<=9 &&passcode>=7 && passcode<=9){
        System.out.println(" you can login");

    }
    else{
        System.out.println("you need to put minimum 7-9 characters");
}}}
