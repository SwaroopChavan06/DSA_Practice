package ArraysDSA;

public class ZeroShiftArray {
    public static void main(String[] args) {
        int arr[] = { 5, 0, 0, 9, 0, 6, 7, 0, 4 };
        System.out.println("Original Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int nonZeroPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroPosition];
                arr[nonZeroPosition] = arr[i];
                arr[i] = temp;
                nonZeroPosition++;
            }
        }

        System.out.println("Array after shifting zeros to the end: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
