package class19;

public class CreditCrd {

    public  void calInterest(double balance){
        System.out.println(balance*0.50);
    }

}
class Visa extends CreditCrd{

}
class AX extends CreditCrd{
    @Override
    public void calInterest(double balance){
        System.out.println(balance*0.07);
    }
}