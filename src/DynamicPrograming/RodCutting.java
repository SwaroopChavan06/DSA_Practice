package DynamicPrograming;

public class RodCutting {

    public static int rodCutting(int[] price) {
        int n = price.length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                maxValue = Math.max(maxValue, price[j - 1] + dp[i - j]);
            }
            dp[i] = maxValue;
        }

        // The final result will be stored in dp[n], which is the maximum obtainable value
        return dp[n];
    }

    // Test cases
    public static void main(String[] args) {
        int[] price1 = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println("Maximum obtainable value: " + rodCutting(price1));  // Output: 22

        int[] price2 = {3, 5, 8, 9, 10, 17};
        System.out.println("Maximum obtainable value: " + rodCutting(price2));  // Output: 18

        int[] price3 = {3};
        System.out.println("Maximum obtainable value: " + rodCutting(price3));  // Output: 3
    }
}

// rod cutting dp