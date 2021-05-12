import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element
        numbers.add(0, 21); // specifying an index
        numbers.add(22);

        System.out.println(numbers); // [21, 20, 22]

        System.out.println(numbers.size()); // 3
        System.out.println(numbers.get(2)); // 22

        System.out.println(numbers.indexOf(20));    // 1
        System.out.println(numbers.indexOf("cat")); // -1
        //returns -1 b/c "cat is not in the ArrayList

        // We'll start by defining an array list and adding some items to it
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts); // [light, medium, medium, dark]

        // using .contains
        roasts.contains("dark"); // true
        roasts.contains("espresso"); // false

        // using .lastIndexOf
        roasts.lastIndexOf("medium"); // 2

        // using .isEmpty
        roasts.isEmpty(); // false
        ArrayList<String> emptyList = new ArrayList<>();
        emptyList.isEmpty(); // true

        // .remove has two variants
            //Note that the return value of .remove() depends on how it is invoked
            //When an index is passed, the removed element is returned.
            // When an object is passed, a boolean indicating whether an item was removed is returned.

        //EXAMPLE 1:
        roasts.remove("espresso"); // false
        roasts.remove("medium"); // true
        System.out.println(roasts); // [light, medium, dark]

        //EXAMPLE 2:
        roasts.remove(2); // "dark"
        System.out.println(roasts); // [light, medium]
    }
}
