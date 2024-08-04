package HashingDSA;
//1508. Range Sum of Sorted Subarray Sums

//You are given the array nums consisting of n positive integers. You computed the sum of all non-empty continuous subarrays from the array and then sorted them in non-decreasing order, creating a new array of n * (n + 1) / 2 numbers.
//Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array. Since the answer can be a huge number return it modulo 109 + 7.


import java.util.Arrays;

//Example 2:
//
//Input: nums = [1,2,3,4], n = 4, left = 3, right = 4
//Output: 6
//Explanation: The given array is the same as example 1. We have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10]. The sum of the numbers from index le = 3 to ri = 4 is 3 + 3 = 6.
//Example 3:
//
//Input: nums = [1,2,3,4], n = 4, left = 1, right = 10
//Output: 50
import java.util.Arrays;

public class arrayString {
    static final int MOD = 1000000007;

    static int rangeSum(int[] nums, int left, int right) {
        int n = nums.length;
        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                result[index++] = sum;
            }
        }

        Arrays.sort(result);
        long sum = 0;
        for (int i = left - 1; i < right; i++) {
            sum = (sum + result[i]) % MOD;
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int left = 1, right = 5;
        int ans = rangeSum(nums, left, right);
        System.out.println(ans);
    }
}

//Input: nums = [1,2,3,4], n = 4, left = 1, right = 5
//Output: 13
//Explanation: All subarray sums are 1, 3, 6, 10, 2, 5, 9, 3, 7, 4. After sorting them in non-decreasing order we have the new array
// [1, 2, 3, 3, 4, 5, 6, 7, 9, 10].
// The sum of the numbers from index le = 1 to ri = 5 is 1 + 2 + 3 + 3 + 4 = 13.