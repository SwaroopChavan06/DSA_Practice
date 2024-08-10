package ArraysDSA;

public class DistinctEleArray {
    public static void main(String[] args) {
        int[] arr = {12, 15, 10, 16, 21, 12, 22, 25, 18, 10, 15, 21, 24};
        int n = arr.length;

        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Distinct Elements: ");
        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
