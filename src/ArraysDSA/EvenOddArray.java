package ArraysDSA;

public class EvenOddArray {
    public static void main(String[] args){
        int[] arr = {7, 2, 9, 4, 6, 1, 3, 8, 5};
        int n= arr.length;
        for (int i=0; i< n; i++){
            System.out.println(arr[i]);
        }
        int[] odd= new int[n];
        for (int i=0; i<n; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+ " ");
            }else {
                odd[i] = arr[i];
            }
        }
        System.out.println();

        for (int i=0; i< n; i++){
            System.out.print(odd[i]);
        }
    }
}
