package basic_programming;
// Package declaration – groups related classes

import java.util.function.Predicate;
// Import Predicate functional interface

class Test7 {

    public static void main(String[] args) {
        // main method – program execution starts here

        Predicate<Integer> p1 = i -> i % 2 == 0;
        /*
         * Predicate<Integer>:
         *  - Predicate is a functional interface
         *  - It takes an Integer as input
         *  - Returns boolean (true/false)
         *
         * i -> i % 2 == 0:
         *  - Lambda expression
         *  - 'i' is input parameter
         *  - Checks if number is EVEN
         */

        Predicate<Integer> p2 = i -> i > 10;
        /*
         * Predicate to check if number is greater than 10
         * (Declared for understanding, not used in this example)
         */

        int[] x = {1, 2, 3, 4, 5, 10, 12, 15};
        /*
         * Integer array
         * for-each loop works only with arrays or collections
         */

        System.out.println("The numbers which are not even:");
        // Message before output

        for (int x1 : x) {
            /*
             * Enhanced for-loop (for-each)
             * Iterates through each element of array x
             * x1 stores one value at a time
             */

            if (p1.negate().test(x1)) {
                /*
                 * p1.negate():
                 *  - Reverses the condition of p1
                 *  - p1 checks EVEN → negate() checks ODD
                 *
                 * test(x1):
                 *  - Passes x1 to predicate
                 *  - Returns true if number is NOT even
                 */

                System.out.println(x1);
                // Prints odd numbers
            }
        }
    }
}