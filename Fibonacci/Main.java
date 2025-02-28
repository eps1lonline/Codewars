public class Fibonacci {
    public static long fib (int n) {
        int current = 1, previous = 0, system;

        for (int i = 0; i < n - 1; i++) {
            system = current;
            current += previous;
            previous = system;
        }

        return current;
    }
}