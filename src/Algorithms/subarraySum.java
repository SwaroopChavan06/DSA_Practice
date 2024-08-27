package Algorithms;
public class subarraySum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
