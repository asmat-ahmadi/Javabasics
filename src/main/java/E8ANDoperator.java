public class E8ANDoperator {
    public static void main(String[] args) {
        boolean goodcredit=true;
        boolean stablejob=true;
        boolean minimumage =false;
        if(goodcredit&&stablejob&&minimumage){
            System.out.println("you can get loan");
        }else{
            System.out.println("you need to fullfil all requirement");
        }
    }
}
