package DynamicPrograming;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        if (!memo.containsKey(n)) {
            memo.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        }

        return memo.get(n);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }
}
