package basic_programming;  // Package declaration (optional). Organizes classes into folders.

import java.util.*;  // Imports all utility classes (ArrayList, Comparator, Collections, etc.)

class tests3 {  // Class declaration
    public static void main(String[] args) {  // Main method — entry point of the program

        // Create an ArrayList of Integer type using Generics (<>)
        ArrayList<Integer> i = new ArrayList<Integer>();

        // Add elements to the ArrayList using .add()
        i.add(23);
        i.add(22);
        i.add(34);
        i.add(32);
       	i.add(38);
        i.add(32);
        i.add(28);

        // Print the ArrayList before sorting
        System.out.println(i);

        /*
         * Create a Comparator using a Lambda expression.
         * Comparator<Integer> means this object compares two Integer values.
         * (I1, I2) -> ... defines a lambda expression with two parameters.
         *
         * Syntax breakdown:
         * (I1, I2) ->           // Lambda operator: arguments -> body
         * (I1 < I2) ? -1 :      // If I1 < I2 return -1  (I1 comes before I2)
         * (I1 > I2) ? 1 : 0     // Else if I1 > I2 return 1, else return 0 (equal)
         *
         * This sorts in ascending order.
         */
        Comparator<Integer> c = (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;

        /*
         * Collections.sort(list, comparator)
         * - Sorts the given list using the provided comparator.
         * - Uses the custom rule defined in the lambda above.
         */
        Collections.sort(i, c);

        // Print the ArrayList after sorting
        System.out.println(i);
    }
}