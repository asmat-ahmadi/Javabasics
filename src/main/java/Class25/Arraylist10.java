package Class25;

import java.util.ArrayList;

public class Arraylist10 {

        public static void main(String[] args) {
            // Create ArrayList listA and add values
            ArrayList<Boolean> listA = new ArrayList<>();
            listA.add(true);
            listA.add(false);
            listA.add(false);

            // Create ArrayList listB and add all values from listA
            ArrayList<Boolean> listB = new ArrayList<>(listA);

            // Print all values from listB using a loop
            for (Boolean value : listB) {
                System.out.println(value);
            }
        }
    }

