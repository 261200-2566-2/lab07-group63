
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /** Case 1 **/
        // Create a set with some elements
        Set<Integer> s1 = new MySet();
        s1.add(1);
        s1.add(2);
        s1.add(4);
        // Print the size of the set
        System.out.println("Size: " + s1.size());
        // Check if the set is empty
        System.out.println("Is empty: " + s1.isEmpty());
        // Check if the set contains an element
        System.out.println("Contains 3: " + s1.contains(3));
        System.out.println("Contains 4: " + s1.contains(4));
        // Add an element to the set
        System.out.println("Add 3: " + s1.add(3));
        // Remove an element from the set
        System.out.println("Remove 3: " + s1.remove(3));
        // Iterate over the elements in the set
        System.out.print("Elements:");
        for (Integer element : s1) {
            System.out.print(" " + element);
        }

        /*Enter new line*/
        System.out.println();

        /** Case 2 **/
        Set<String> s2 = new MySet<>();
        s2.add("a");
        s2.add("b");
        s2.add("d");
        // Check if the first set contains all the elements in the second set
        System.out.println("Contains all: " + s2.containsAll(s2));
        // Add all the elements in the second set to the first set
        System.out.println("Add all: " + s2.addAll(s2));
        // Remove all the elements in the second set from the first set
        System.out.println("Remove all: " + s2.removeAll(s2));
        // Retain all the elements in the first set that are also in the second set
        System.out.println("Retain all: " + s2.retainAll(s2));
        // Clear the first set
        s2.clear();
        System.out.println("Size after clear: " + s2.size());


    }




}