package Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ropesConnect {
    public static void main(String[] args) {
        int arr[] = {4,3,2,6} ;
//        int arr[] = {1,2,3} ;
        int n = arr.length;
        Arrays.sort(arr);
        int sum=arr[0];
        int fsum=0;
        for (int i = 1; i<n; i++) {
            sum = sum + arr[i];
            fsum=fsum+sum;
            System.out.println(sum);
        }
//        fsum=fsum-arr[0];
        System.out.println("Final Ans: "+fsum);
    }
}
