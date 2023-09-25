package Class16;

public class replit138 {
    private String PrivateM(){
        return "private";
    }
        String DefaultM(){
            return "default";
        }
        protected String ProtectedtM(){
            return "protected";
        }
        public String PublicM(){
            return "public";
        }
    class Main {
    }
        public static void main(String[]args){
            replit138 obj =new replit138();
            System.out.println(obj.DefaultM());
            System.out.println(obj.ProtectedtM());
            System.out.println(obj.PublicM());
            System.out.println(obj.PrivateM());
        }
    }

