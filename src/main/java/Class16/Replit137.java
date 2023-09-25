package Class16;

public class Replit137 {

        private void privateM(){
            System.out.println("This is Private Method");
        }
        void defaultM(){
            System.out.println("This is Default Method");
        }
        protected void protectedM(){
            System.out.println("This is Protected Method");
        }
        public void publicM(){
            System.out.println("This is Public Method");
        }
        public static void main(String[]args){
            Replit137 printinfo=new Replit137();
            printinfo.privateM();
            printinfo.defaultM();
            printinfo.protectedM();
            printinfo.publicM();
        }
    }

