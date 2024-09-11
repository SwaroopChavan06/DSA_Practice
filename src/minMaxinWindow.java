import java.util.*;
public class minMaxinWindow
{
    static void max(int arr[], int n, int k)
    {
        ArrayList<Integer> resultmax = new ArrayList<>();
        ArrayList<Integer> resultmin = new ArrayList<>();


        for(int i =0; i<n-k+1; i++){
            int max = arr[i];
            int min = arr[i];
            for(int j = i; j<i+k; j++){
                if(max<arr[j]){
                    max = arr[j];
                }
                if(min>arr[j]){
                    min = arr[j];
                }
            }
            resultmax.add(max);
            resultmin.add(min);
        }

        System.out.println(resultmax);
        System.out.println(resultmin);
    }


    public static void main(String[] args) {
        int[] array={1,2,3,7,2,8,4,5, 1};
        int n = 9;
        int k = 3;
        max(array,  n,  k);

    }
}
//  array[]={1,2,3,7,2,8,4,5};
//  int n = 9;
//  int k = 3;
//  find max[]={3,7,7,8,8,8,5} and min[1,2,2,2,2,4,1] for every window
//  max&min[size] = n-k;