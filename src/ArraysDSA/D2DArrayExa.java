package ArraysDSA;

import java.util.Scanner;

public class D2DArrayExa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count=0;

        int[][] arr= new int[n][m];
         for (int i =0; i<n; i++){
             for (int j = 0 ; j<m; j++){
                 arr[i][j]=in.nextInt();
                 count += arr[i][j];
             }
             System.out.println();
         }
        System.out.println(count);
    }
}
