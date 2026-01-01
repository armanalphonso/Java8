package basic_programming;   // This class belongs to the package 'basic_programming'

// Importing Function<T, R> from java.util.function package.
// Function<T, R> is a functional interface that takes an input of type T and returns a result of type R.
import java.util.function.*;

class test1 {
    public static void main(String[] args) {

        /*
         * Function<Integer, Integer>
         * ---------------------------
         * This is a functional interface with two type parameters:
         *   - The first Integer is the input type.
         *   - The second Integer is the return/output type.
         *
         * Lambda Expression:
         * ------------------
         * i -> i * i
         * - 'i' is the input parameter.
         * - '->' separates the parameter from the body.
         * - 'i * i' is the return expression, giving the square of i.
         *
         * Meaning: This lambda defines a function that takes an Integer 'i' and returns its square.
         */
        Function<Integer, Integer> f = i -> i * i;

        // f.apply(40) calls the lambda function with 40 as input and returns 40*40
        System.out.println("The Square of 40: " + f.apply(40));

        // f.apply(50) calls the lambda function with 50 as input and returns 50*50
        System.out.println("The Square of 50: " + f.apply(50));
    }
}