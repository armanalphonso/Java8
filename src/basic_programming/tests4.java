package basic_programming;

/*
 * INTERFACE: Left
 * ----------------
 * Contains one default method m1().
 * Default methods allow interfaces to include method bodies (Java 8+).
 */
interface Left {

    /*
     * default method m1()
     * This method prints a message.
     */
    default void m1() {
        System.out.println("Left Interface m1 method");
    }
}


/*
 * INTERFACE: Right
 * -----------------
 * Also contains a default method m1() with the same signature.
 * This creates a conflict when a class implements both Left and Right.
 */
interface Right {

    /*
     * Another default method m1() with same name and signature.
     */
    default void m1() {
        System.out.println("Right interface m1");
    }
}


/*
 * CLASS IMPLEMENTING TWO INTERFACES
 * ----------------------------------
 * class tests4 implements Left, Right
 *
 * Problem:
 * --------
 * Both Left and Right provide a default method with the SAME signature:
 *       void m1()
 *
 * Java ambiguity:
 * ---------------
 * The compiler cannot decide which default method to inherit.
 *
 * Rule in Java:
 * -------------
 * → If two interfaces provide the same default method,
 *   the implementing class MUST override and provide its own method,
 *   otherwise compile-time error occurs.
 */
class tests4 implements Left, Right {

    /*
     * OVERRIDING REQUIRED to resolve the diamond conflict.
     *
     * This method replaces both interface versions of m1().
     * It is the version that will run when m1() is called.
     */
    public void m1() {
        System.out.println("Our own m1 method");
    }

    /*
     * MAIN METHOD
     * ------------
     * Entry point of the program.
     * It creates an object of tests4 and calls m1().
     */
    public static void main(String[] args) {

        /*
         * OBJECT CREATION:
         * new tests4()
         * Creates an instance of tests4.
         */
        tests4 t = new tests4();

        /*
         * METHOD CALL:
         * Calls the overridden m1() method in the class.
         * This will print:
         *    "Our own m1 method"
         */
        t.m1();
    }
}