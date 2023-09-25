package class22;

public interface Movable {
    public abstract void move();
}
class Dog01 implements Movable{
    public void move(){
        System.out.println("Dog can jump and run ");
    }
    }

    class  Car01 implements Movable {
    @Override  // this ovrride is optional
        public void move(){
        System.out.println("can drive and move too");
    }
}