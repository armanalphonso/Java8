package basic_programming;
// Package declaration – groups related classes

import java.util.ArrayList;
// Import ArrayList class (resizable collection)

import java.util.function.Predicate;
// Import Predicate functional interface

class Employee {

    String name;
    // Instance variable to store employee name

    double salary;
    // Instance variable to store employee salary

    Employee(String name, double salary) {
        // Constructor – used to initialize Employee object

        this.name = name;
        // 'this.name' refers to current object's name
        // 'name' is the constructor parameter

        this.salary = salary;
        // Assigning parameter value to instance variable
    }
}

class Tests6 {

    public static void main(String[] args) {
        // main method – program execution starts here

        ArrayList<Employee> l = new ArrayList<Employee>();
        /*
         * ArrayList<Employee>:
         *  - ArrayList is a dynamic collection
         *  - <Employee> is a generic type
         *  - It allows only Employee objects in the list
         */

        l.add(new Employee("zaid", 1000));
        // Creating Employee object and adding it to list

        l.add(new Employee("Huzaifa", 4000));
        // Adding another Employee object

        l.add(new Employee("Waqas", 3000));
        // Adding another Employee object

        l.add(new Employee("faraaz", 2000));
        // Adding another Employee object

        l.add(new Employee("zaid", 5000));
        // Adding another Employee object

        Predicate<Employee> p = e -> e.salary > 3000;
        /*
         * Predicate<Employee>:
         *  - Predicate is a functional interface
         *  - It takes an Employee object as input
         *  - Returns boolean (true/false)
         *
         * e -> e.salary > 3000:
         *  - Lambda expression
         *  - 'e' represents an Employee object
         *  - Condition checks if salary is greater than 3000
         */

        for (Employee e1 : l) {
            /*
             * Enhanced for-loop (for-each loop)
             * Iterates through each Employee object in ArrayList 'l'
             * e1 represents one Employee at a time
             */

            if (p.test(e1)) {
                /*
                 * p.test(e1):
                 *  - Calls Predicate test method
                 *  - Returns true if salary > 3000
                 */

                System.out.println(e1.name + ":" + e1.salary);
                // Prints employee name and salary
            }
        }
    }
}