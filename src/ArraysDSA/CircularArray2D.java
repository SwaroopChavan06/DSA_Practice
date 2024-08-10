package ArraysDSA;

import java.util.Scanner;

public class CircularArray2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = i + j;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("//////////////////////");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == m-1) {
                    System.out.print(arr[i][j] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}