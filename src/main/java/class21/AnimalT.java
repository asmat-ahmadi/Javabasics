package class21;

public class AnimalT {      // wea are creating effecient way to call this method by Arrays//
    public static void main(String[] args) {
        Animal [] arr={new dog(),new cat()};
        for(Animal a:arr){
            a.speak();
            a.sleep();
            a.eat();
        }

    }
}
