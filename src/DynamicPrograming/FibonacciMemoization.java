package DynamicPrograming;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {
    // Memoization map to store computed Fibonacci values
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        // Base cases
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Check if the value is already in the memo map
        if (!memo.containsKey(n)) {
            // Store the computed value in the memo map
            memo.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        }

        // Return the memoized value
        return memo.get(n);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }
}
