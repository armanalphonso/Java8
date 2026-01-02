package basic_programming; 
// Package name (used to group related classes)

import java.util.function.Predicate;
// Import Predicate functional interface (used for conditions)

class Employee {

    int salary;           
    // Instance variable to store employee salary

    boolean isHavingGf;   
    // Instance variable to store true/false value

    Employee(int salary, boolean isHavingGf) {
        // Constructor: used to initialize object data

        this.salary = salary;
        // 'this.salary' refers to current object's salary
        // 'salary' on right side is constructor parameter

        this.isHavingGf = isHavingGf;
        // Assigning parameter value to instance variable
    }
}

class Test6 {

    public static void main(String[] args) {
        // main method: program execution starts here

        Employee e = new Employee(15000, true);
        // Creating Employee object
        // salary = 15000
        // isHavingGf = true

        Predicate<Employee> p1 =
                emp -> emp.salary > 10000 && emp.isHavingGf;
        /*
         * Predicate<Employee>:
         *   Predicate is a functional interface
         *   It takes an Employee object and returns boolean
         *
         * emp -> :
         *   'emp' is a parameter representing Employee object
         *
         * emp.salary > 10000:
         *   Checks if salary is greater than 10000
         *
         * emp.isHavingGf:
         *   Checks boolean value (true/false)
         *
         * && :
         *   Logical AND operator
         *   Both conditions must be true
         */

        System.out.println(p1.test(e));
        // test(e) passes Employee object to Predicate
        // Returns true or false
        // Output will be: true
    }
}