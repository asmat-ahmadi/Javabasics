package class22;

public interface  Vehicle {
    void drive();

}
interface bike extends Vehicle{
    void applyBreak();
}
class HondaBike implements bike {
    @Override
    public  void drive(){
        System.out.println("driving");
    }
   @Override
   public  void applyBreak() {
       System.out.println("stop");
   }
}