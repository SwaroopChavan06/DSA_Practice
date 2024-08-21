package Algorithms;

public class selectionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {10, 110, 90,30,40, 70, 60, 50, 40};
        int n = arr.length;
        for(int i =0; i< n-1; i++){
            int min=i;
            for (int j =i+1; j<n; j++){
                if(arr[min]> arr[j]){
                    min=j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//        for (int i = 0; i < n - 1; i++) {
//int min = i;
//            for (int j = i + 1; j < n; j++) {
//        if (arr[j] < arr[min]) {
//min= j;
//                }
//                        }
//int temp = arr[min];
//arr[min] = arr[i];
//arr[i] = temp;
//        }