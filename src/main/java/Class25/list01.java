package Class25;

import java.util.ArrayList;
import java.util.List;

public class list01 {
    public static void main(String[] args) {
        // Create a list of countries
        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Australia");
        countries.add("Kazakhstan");
        countries.add("Afghanistan");
        countries.add("Pakistan");
        countries.add("Russia");

        // Call the method to remove elements starting with 'A'
        List<String> filteredCountries = removeElementsStartingWithA(countries);

        // Print the filtered list
        System.out.println(filteredCountries);
    }

    // Method to remove elements starting with 'A'
    public static List<String> removeElementsStartingWithA(List<String> inputList) {
        List<String> filteredList = new ArrayList<>();
        for (String element : inputList) {
            if (!element.startsWith("A")) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}


