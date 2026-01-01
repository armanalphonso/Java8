package basic_programming;  
// Package name – used to group related classes and interfaces

interface Interf2 {
    // Interface declaration

    public static void m1() {
        // static method inside interface
        // static methods belong to the interface itself

        System.out.println("Interface static Method");
    }
}

class Test5 implements Interf2 {
    // Class Test5 implements Interf2
    // NOTE: static methods are NOT inherited, so implementing is optional here

    public static void main(String[] args) {
        // main method – program execution starts here

        Interf2.m1();   
        // Correct syntax to call static method of interface
        // InterfaceName.methodName();

        Test5 t = new Test5();
        // Object creation (not required for calling static method)
    }
}