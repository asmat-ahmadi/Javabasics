package Projectassignment;

public class ProjectTask01 {
    public static void main(String[] args) {
        int[] temp = {68, 66, 70, 75, 77, 80, 72};
        int highesttemp = temp[0];
        int lowesttemp = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > highesttemp) {
                highesttemp = temp[i];
            }
            if (temp[i] < lowesttemp) {
                lowesttemp = temp[i];
            }
        }
        System.out.println("The highest temprature of the week is " + highesttemp);
        System.out.println("The lowest temprature of the week is " + lowesttemp);
    }}





