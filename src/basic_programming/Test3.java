package basic_programming;

class Test3 {
    public static void main(String[] args) {

        // Runnable r = () -> { ... };
        // ------------------------------------------------------
        // Runnable is a functional interface (only one abstract method: run()).
        // Using a lambda expression () -> { } to provide implementation of run().
        // ()  → No arguments for the run() method.
        // ->  → Lambda operator.
        // { } → Body of the run() method.
        //
        // Inside run(), a loop prints "Child Thread-1".
        // NOTE: Your original loop used i < 0, which runs ZERO times.
        // I changed it to i < 10 so output can be seen.
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread-1");
            }
        };

        // Creating a Thread object and passing the Runnable object.
        // Thread t = new Thread(r);
        // ------------------------------------------------------
        // When the thread starts, it will execute r.run()
        Thread t = new Thread(r);

        // Start the thread.
        // ------------------------------------------------------
        // t.start() creates a new call stack → executes run() in parallel.
        t.start();

        // Main thread loop prints "Main Thread-1" 10 times.
        // ------------------------------------------------------
        // Both loops (child and main) run concurrently.
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread-1");
        }
    }
}