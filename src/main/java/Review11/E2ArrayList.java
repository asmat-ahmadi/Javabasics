package Review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        int [] numbers =new int[10];// it would be better to put the estimate numbers rather than select less
        ArrayList<Integer> nums=new ArrayList<Integer>(10000);
        nums.add(10);
        nums.add(15);
        nums.add(45);
        nums.add(50);
        System.out.println(nums);
        nums.remove(45);// this way can not remove
        //nums.remove(new integer(45);
        System.out.println(nums);
        ArrayList<String> names=new ArrayList<String>();
        names.add("jamil");
        names.add("Arture");




    }
}
