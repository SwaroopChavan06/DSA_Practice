package ArraysDSA;

public class RearangeArray {
    public static void main(String[] args) {
        //int arr[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        System.out.println("Original Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k=arr.length;

        for (int i = 0; i < k; i++) {
            if (arr[i] > -1) {
                int n= arr[i];
                int temp= arr[n];
                arr[n]=n;
                arr[i]= temp;
            }
        }

        System.out.println("Array after Rearranging Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
