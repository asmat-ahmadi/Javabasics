package Class25;

import java.util.ArrayList;

public class array291 {
    public static void main(String[] args) {
        ArrayList<Boolean> list =new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add((false));
        for(Boolean list1:list){
            System.out.println(list1);
        }
    }
}
