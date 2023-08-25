package class10;

public class Grading2darrays {
    public static void main(String[] args) {
        int[] Sclass = {40, 45, 50, 60, 70, 85, 90};
        int highestgrade = Sclass[0];
        int lowestgrade = Sclass[0];
        for (int i = 0; i < Sclass.length; i++) {
            if (Sclass[i] > highestgrade) {
                highestgrade = Sclass[i];
            }
            if (Sclass[i] < lowestgrade) {
                lowestgrade = Sclass[i];
            }
        }
        System.out.println("the highest grade of  this class is " + highestgrade);
        System.out.println("the lowest grade of  this class is " + lowestgrade);
}
    }