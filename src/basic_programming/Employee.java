package basic_programming;  // Package declaration, used to organize classes in a folder structure

import java.util.*;  // Import all utility classes: ArrayList, Collections, Comparator, etc.

// Employee class definition
class Employee {
    String name;  // Instance variable to store employee name
    int eno;      // Instance variable to store employee number

    // Constructor to initialize Employee object
    Employee(String name, int eno) {
        this.name = name;  // Assign name
        this.eno = eno;    // Assign employee number
    }

    // Override toString() method to provide a readable representation of Employee
    public String toString() {
        // Format: "employee number : employee name"
        return eno + ":" + name;
    }
}

// Test class with main method
class Test {
    public static void main(String[] args) {

        // Create an ArrayList to store Employee objects
        ArrayList<Employee> i = new ArrayList<Employee>();

        // Add Employee objects to the ArrayList
        i.add(new Employee("Durga", 872425));
        i.add(new Employee("Sunny", 212345));
        i.add(new Employee("Bunny", 111213));
        i.add(new Employee("Chinny", 434343));
        i.add(new Employee("Vinny", 424345));

        // Print ArrayList before sorting
        System.out.println(i);  // Calls each Employee's toString() method automatically

        /*
         * Sort the ArrayList using a Lambda expression as Comparator
         * Collections.sort(list, comparator)
         *
         * Comparator logic:
         * (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0
         *
         * Explanation:
         * - e1, e2 are Employee objects
         * - If e1.eno < e2.eno, return -1 => e1 comes before e2
         * - If e1.eno > e2.eno, return 1 => e1 comes after e2
         * - If equal, return 0 => no change in order
         *
         * This sorts employees in ascending order of their employee number (eno)
         */
        Collections.sort(i, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);

        // Print ArrayList after sorting
        System.out.println(i);
    }
}