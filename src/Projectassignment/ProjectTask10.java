package Projectassignment;


import java.util.HashSet;
import java.util.Set;

public class ProjectTask10 {
    public static void main(String[] args) {
        String[] stringsArray = {"apple", "banana", "cherry", "apple", "date", "banana"};

        // Create a HashSet to store unique strings
        Set<String> uniqueStrings = new HashSet<>();

        System.out.println("Duplicate strings in the array:");

        for (String str : stringsArray) {
            // If the string is already in the HashSet, it's a duplicate
            if (!uniqueStrings.add(str)) {
                System.out.println(str);
            }
        }
    }
}

