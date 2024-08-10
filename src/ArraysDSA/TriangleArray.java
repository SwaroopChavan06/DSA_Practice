package ArraysDSA;

public class TriangleArray {
    public static void main(String[] args){

        int[] arr = {4, 6, 3, 7};
        int n= arr.length;

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int count=0;
        for (int i=0; i< n-2; i++){
            for (int j=i+1; j< n-1; j++){
                for (int k= j+1; k< n; k++){
                    if(arr[i]+arr[j]>arr[k]){
                        count++;
                        System.out.print(arr[i]+ " "+ arr[j]+" "+arr[k]);
                        System.out.println();
                    }
                }

            }
        }
        System.out.println(count);
    }
}
