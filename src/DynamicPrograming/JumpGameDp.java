import java.util.Arrays;

class JumpGameDP {

    // Function to find the minimum number of jumps to reach the end of the array
    public static int minJumps(int[] arr) {
        int n = arr.length;

        // If the array has only one element, we're already at the end
        if (n == 1) return 0;

        // If the first element is 0, then we can't make any progress
        if (arr[0] == 0) return -1;

        // dp[i] will hold the minimum number of jumps required to reach index i
        int[] dp = new int[n];

        // Initialize dp[] with a large number (infinity)
        Arrays.fill(dp, Integer.MAX_VALUE);

        // It takes 0 jumps to reach the first element
        dp[0] = 0;

        // Build the dp array from left to right
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Check if index i is reachable from index j
                if (i <= j + arr[j] && dp[j] != Integer.MAX_VALUE) {
                    // Update dp[i] if a better jump count is found
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                    break;
                }
            }
        }

        // If the last element is still unreachable, return -1
        return dp[n - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1];
    }

    // Test cases
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr1));  // Output: 3

        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(minJumps(arr2));  // Output: 10

        int[] arr3 = {2, 1, 0, 3};
        System.out.println(minJumps(arr3));  // Output: -1
    }
}
