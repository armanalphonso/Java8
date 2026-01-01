package basic_programming;  // This class group belongs to the package 'basic_programming'

/*
 * INTERFACE DECLARATION
 * ----------------------
 * 'interface' is used to declare an interface in Java.
 * An interface contains abstract methods (methods without body)
 * that must be implemented by any class that implements the interface.
 *
 * Here:
 * Interf → interface name
 * public void m1(); → abstract method (no implementation)
 */
interface Interf {
    public void m1();  // Method signature only; no body because it's an interface
}

/*
 * CLASS IMPLEMENTING AN INTERFACE
 * --------------------------------
 * 'implements' keyword is used when a class provides implementation
 * for the methods declared in an interface.
 *
 * Demo implements Interf means:
 * Demo must give a body/definition for method m1().
 */
class Demo implements Interf {

    /*
     * Method Implementation
     * ----------------------
     * The method m1() is defined exactly as declared in the interface.
     * The class provides its own behavior inside the method body.
     */
    public void m1() {
        System.out.println("Hello...");
    }
}

/*
 * MAIN CLASS
 * ----------
 * Contains the main() method which is the entry point of the program.
 */
class Test2 {
    public static void main(String[] args) {

        /*
         * Interf i = new Demo();
         * -------------------------
         * 'Interf' is the interface type.
         * 'new Demo()' creates an object of class Demo.
         * The reference variable 'i' refers to this Demo object.
         *
         * This is called:
         * → Upcasting (parent interface reference pointing to child class object)
         * It allows calling only the methods declared in the interface.
         */
        Interf i = new Demo();

        // Calls the implemented method m1() of Demo class
        i.m1();
    }
}
