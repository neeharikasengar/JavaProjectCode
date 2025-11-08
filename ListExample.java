

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicates are allowed

        // Access elements by index
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Iterate through the list
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an element
        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);

        // Get the size of the list
        System.out.println("Number of fruits: " + fruits.size());
    }
}
