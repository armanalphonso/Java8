package basic_programming;   // Declares that this class belongs to the package 'basic_programming'

/*
 * A class in Java is a blueprint for creating objects.
 * Here, the class is named 'Tests'. The filename must also be Tests.java.
 */
class Tests {

    /*
     * 'public'  → method can be accessed from anywhere.
     * 'static'  → belongs to the class, not an object; can be called without creating an instance.
     * 'int'     → return type of the method (it returns an integer).
     * 'squareIt' → method name (follows camelCase convention).
     * (int n)   → parameter list: this method accepts one integer named 'n'.
     *
     * Method purpose: return the square of the given number.
     */
    public static int squareIt(int n) {
        return n * n;    // Computes the square of n and returns it
    }

    /*
     * main() method → entry point of every Java application.
     * 'String[] args' → command-line arguments.
     *
     * Inside the main method, we call the squareIt() method and print results.
     */
    public static void main(String[] args) {

        // System.out.println prints text to the console with a new line at the end.
        System.out.println("The square of 4: " + squareIt(4));
        System.out.println("The square of 5: " + squareIt(5));
    }
}