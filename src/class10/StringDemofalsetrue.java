package class10;

public class StringDemofalsetrue {
    public static void main(String[] args) {
        String Username="Abckuuu123";
        String Passcode="Abc123";
        String confirmedpasscode="Abc123";
        if(Username.isEmpty()||Passcode.isEmpty()) {
            System.out.println(" Username or Password cannot be empty");
        } else if(Passcode.length()<6){
            System.out.println("Password is too short");
        } else if ( Username.contains(Username)){
            System.out.println("Password cannot contain username");
        } else if(confirmedpasscode.equals(Passcode)){
            System.out.println("passcode don not match");
        }else;
        System.out.println("Your username and password has been created ");



    }

}
