package DynamicPrograming;

public class CoinChangeRecursion {

    public static int countWays(int[] coins, int n, int sum) {
        // Base cases
        if (sum == 0) {
            return 1;  // If sum is 0, there's one way to make the sum (using no coins)
        }
        if (sum < 0) {
            return 0;  // If sum is negative, no solution exists
        }
        if (n <= 0 && sum >= 1) {
            return 0;  // If there are no coins left and the sum is still positive, no solution exists
        }

        // Recursive case:
        // (1) Include the current coin and reduce the sum
        // (2) Exclude the current coin and move to the next coin
        return countWays(coins, n, sum - coins[n - 1]) + countWays(coins, n - 1, sum);
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 4;
        System.out.println("Total ways to make sum " + sum + " is " + countWays(coins, coins.length, sum));

        int[] coins2 = {2, 5, 3, 6};
        int sum2 = 10;
        System.out.println("Total ways to make sum " + sum2 + " is " + countWays(coins2, coins2.length, sum2));

        int[] coins3 = {10};
        int sum3 = 10;
        System.out.println("Total ways to make sum " + sum3 + " is " + countWays(coins3, coins3.length, sum3));

        int[] coins4 = {4};
        int sum4 = 5;
        System.out.println("Total ways to make sum " + sum4 + " is " + countWays(coins4, coins4.length, sum4));
    }
}
