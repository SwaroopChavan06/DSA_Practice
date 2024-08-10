package ArraysDSA;

public class ReverseArray {
    public static void main(String[] args) {
        int temp;

        int arr[] = { 5, 7, 2, 9, 2, 6, 7, 3, 4 };
        System.out.println("Original Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int j = arr.length - 1;

        for (int i = 0; i < arr.length/2 ; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        System.out.println();
        System.out.println("Rotated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

