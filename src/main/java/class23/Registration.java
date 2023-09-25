package class23;

public class Registration {
    private String Email;
    private String UserName;
    private String PassWord;

    public Registration(String Email, String UserNmae, String PassWord) {
        this.Email = Email;
        this.UserName = UserName;
        this.PassWord = PassWord;
    }
    public String getEmail(){
        return Email;
    }
    public String getUserName(){
        return UserName;
    }
    public String getPassWord(){
        return PassWord;
    }
    public void setEmail(String email){
        if(Email.contains("yahoo")) {
          this.Email=Email;
        }else{
            System.out.println("correct email is not provided");

        }

    }
    public void setUserName(String UserName) {
        if(!UserName.isEmpty()&& UserName.length()>6){
        this.UserName=UserName;
    }else {
            System.out.println("The Username is not corrected entered");
        }
   // public void setPassWord(String PassWord) {
       // this.PassWord = PassWord;
    }
}
