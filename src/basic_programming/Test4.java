package basic_programming;

/*
 * INTERFACE DECLARATION
 * ----------------------
 * 'interface' is a special type in Java that contains:
 *   - abstract methods (without body)
 *   - default methods (with body) → introduced in Java 8
 *   - static methods (with body)
 *
 * Here, Interf contains one default method.
 */
interface Interfs {

    /*
     * DEFAULT METHOD
     * ---------------
     * Syntax: default returnType methodName() { ... }
     *
     * 'default' keyword:
     *  - Allows the interface to provide a method implementation
     *  - Prevents breaking old classes when new methods are added to an interface
     *
     * This method prints a message when called.
     */
    default void m1() {
        System.out.println("Default Method");
    }
}


/*
 * CLASS IMPLEMENTING INTERFACE
 * -----------------------------
 * 'class Test4 implements Interf'
 * → Test4 agrees to follow the "contract" of the interface Interf.
 *
 * Even though Interf has a default implementation of m1(),
 * the class is allowed to OVERRIDE it.
 */
class Test4 implements Interf {

    /*
     * METHOD OVERRIDING
     * -------------------
     * Here, Test4 provides its own version of m1().
     *
     * Syntax for overriding:
     *   - same method name (m1)
     *   - same return type (void)
     *   - same parameter list ()
     *
     * This overrides the default method from Interf.
     */
    public void m1() {
        System.out.println("overriding version of Default method");
    }

    /*
     * MAIN METHOD
     * ------------
     * Entry point of ANY Java program.
     * public → can be accessed by JVM from anywhere  
     * static → runs without creating an instance of Test4  
     * void → does not return anything  
     * String[] args → stores command-line arguments
     */
    public static void main(String[] args) {

        /*
         * OBJECT CREATION
         * ----------------
         * Test4 t = new Test4();
         * 'new' allocates memory and creates an object of Test4.
         * 't' is a reference variable pointing to that object.
         */
        Test4 t = new Test4();

        /*
         * METHOD CALL
         * -----------
         * Calls the overridden version of m1() in Test4,
         * not the default one from Interf.
         */
        t.m1();
    }
}