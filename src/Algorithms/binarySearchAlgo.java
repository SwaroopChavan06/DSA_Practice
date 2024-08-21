package Algorithms;

public class binarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {10, 50, 70, 80, 90};
        int target = 90;
        int high = arr.length - 1;
        int low = 0;
        boolean flag = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (flag) {
            System.out.println("Element Present");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
