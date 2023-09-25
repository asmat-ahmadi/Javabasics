package Syntaxproject;

public class Enrollment {
    private String email;
    private String userName;
    private  String passWord;

    public Enrollment(String email, String userName, String passWord) {
        if(isValid(email,userName,passWord)){
            this.email = email;
            this.userName = userName;
            this.passWord = passWord;
        }else{
            System.out.println("sorry your email is not yahoo");
        }
  }
    public void info(){
        System.out.println("user Information:");
        System.out.println("Email:"+email);
        System.out.println("user name:"+userName);
        System.out.println("password:"+passWord);
}
private boolean isValid(String email,String userName,String passWord){
        return email !=null && email.endsWith("yahoo.com")&& userName!=null && userName.length()>=7
            && passWord !=null && passWord.length()>=7 && !passWord.contains(userName);
}

    public static void main(String[] args) {
        Enrollment Reg=new Enrollment("usthabib@gmail.com","habitr55","huyhhg64%");
        Reg.info();
    }
}