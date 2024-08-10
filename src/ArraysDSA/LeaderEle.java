package ArraysDSA;

public class LeaderEle {
    public static void main(String[] args) {
   //  int arr[]= {16, 17, 4, 3, 5, 2};
        int arr[]= {1, 2, 3, 4, 5, 2};

        System.out.print("Original Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int maxright= arr[arr.length-1];

        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]>=maxright){
                maxright=arr[i];
                System.out.print(maxright+ " ");
            }
        }

//
//        int maxright= arr[0];
//        for (int i = 0; i <= arr.length-1; i++) {
//            if(arr[i]<maxright){
//                maxright=arr[i];
//                System.out.print(maxright+ " ");
//            }
//        }
    }
}
