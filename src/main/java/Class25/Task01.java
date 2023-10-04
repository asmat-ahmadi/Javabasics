package Class25;

import java.util.HashMap;

public class Task01 {
    public static void main(String[] args) {
        HashMap<String,Integer> floor=new HashMap<>();
        floor.put("1=google",10);
        floor.put("2=syntax",20);
        floor.put("3=microsoft",30);
        floor.put("4=uber",40);
        floor.put("5=lyft",50);
        floor.put("6=bank",60);
        floor.put("7=google",10);
        System.out.println(floor);
        for (int i = 0; i < floor.size(); i++) {
            System.out.println(i);

        }
        floor.put("4=uber",55);
        System.out.println(floor);
        floor.remove("7=google",10);
        System.out.println(floor);


    }
}
