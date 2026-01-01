package basic_programming;   // Declares that this class belongs to the package 'basic_programming'

import java.util.function.*; 
// Imports Java's functional interfaces including Predicate<T>
// Predicate<T> represents a boolean-valued function of one argument.

class test {
    public static void main(String[] args) {

        /*
         * Predicate<Integer> p
         * --------------------
         * Predicate<T> is a functional interface with:
         *    - Input: T (here Integer)
         *    - Output: boolean
         *
         * Lambda expression: i -> i % 2 == 0
         * ------------------------------------------------
         * i               → input parameter (Integer)
         * %               → modulus operator (remainder)
         * i %jjj 2 == 0      → condition checking if i is even
         *
         * Meaning:
         * The lambda checks whether the given number is even and returns true/false.
         */
        Predicate<Integer> p = i -> i % 2 == 0;

        // p.test(4) checks whether 4 is even → returns true
        System.out.println(p.test(4));  

        // p.test(5) checks whether 5 is even → returns false
        System.out.println(p.test(5));  
    }
}
