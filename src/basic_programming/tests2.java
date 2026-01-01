package basic_programming;   // This file belongs to the package 'basic_programming'

/*
 * FUNCTIONAL INTERFACE DECLARATION
 * --------------------------------
 * interface Interf
 *  - Declares an interface named 'Interf'.
 *
 * public void add(int a, int b);
 *  - An abstract method with two integer parameters.
 *  - No method body is allowed inside an interface method (unless default or static).
 *  - Because this interface has exactly one abstract method,
 *    it is a "Functional Interface". (Even without @FunctionalInterface annotation)
 *
 * Functional interfaces can be implemented using:
 *  - A class (normal implementation)
 *  - Anonymous inner class
 *  - Lambda expression (Java 8 onwards)
 */
interface Interf1 {
    public void add(int a, int b);
}

/*
 * MAIN CLASS
 * ----------
 * Contains the main method where execution begins.
 */
class tests2 {
    public static void main(String[] args) {

        /*
         * LAMBDA EXPRESSION IMPLEMENTATION
         * --------------------------------
         * Interf i = (int a, int b) -> System.out.println("The Sum:" + (a + b));
         *
         * Breakdown:
         * 1. Interf i
         *      - 'i' is a reference variable of type Interf (the interface).
         *
         * 2. (int a, int b)
         *      - Parameter list for the lambda function.
         *      - Matches the parameters of add(int a, int b).
         *
         * 3. ->
         *      - Arrow token separating the parameters from the body.
         *
         * 4. System.out.println("The Sum:" + (a + b))
         *      - This is the body of the lambda.
         *      - For a single statement, braces {} are optional.
         *
         * IMPORTANT:
         * Lambda expressions can be used because Interf is a functional interface
         * (it has exactly one abstract method).
         */
        Interf1 i = (int a, int b) -> System.out.println("The Sum: " + (a + b));

        // Calling lambda method with different values
        i.add(10, 20);       // Output: The Sum: 30
        i.add(100, 200);     // Output: The Sum: 300
        i.add(1000, 2000);   // Output: The Sum: 3000
    }
}