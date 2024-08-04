public class Practice_java {
    public static void main(String[] args) {
        // The array elements
        int arr[] = {10, 2, 3, 99, 12, 0};

        // Loop for start index
        // for (int i = 0; i < arr.length; i++) {
        //     // Loop for end index
        //     for (int j = i; j < arr.length; j++) {
        //         // Print subarray
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(arr[k] + " ");
        //         }
        //         System.out.println();
        //     }
        // }

        // // window
        // Initialize minSum with a large value
        // int minSum = Integer.MAX_VALUE;
        // int size = 6;
        // int k = 3;
        // int limit = size- k;

        // // Loop to find the minimum sum of contiguous subarrays of length k
        // for (int i = 0; i <= size - k; i++) {
        //     int sum = 0;
        //     for (int j = i; j < i + k; j++) {
        //         sum += arr[j];
        //     }
        //     minSum = Math.min(minSum, sum);
        // }


        //optimized version
        Integer[] array = {12, 10, 45, 78, 79, 46, 42, 15, 19};
        int k = 3;
        int maxSum = 0;
        int sum = 0;
        int index = 0;
        int size = array.length;
        while (index < size && index < k) {
            sum += array[index];
            index++;
        }

        maxSum = sum;

        for (int i = 1; i < size - k; i++) {
            int prev = array[i - 1];
            int next = array[i + k - 1];
            sum = sum - prev + next;
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);

    }
}
