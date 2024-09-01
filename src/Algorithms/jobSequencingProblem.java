package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class jobSequencingProblem {
    public static void main(String[] args) {
//        int[][] jobs={
//                {0,4,20},
//                {1,1,10},
//                {2,1,40},
//                {3,1,30}
//        };

        int[][] jobs={
                {0,2,100},
                {1,1,19},
                {2,2,27},
                {3,1,25},
                {4,3,15},
        };

        int k = 3;
        int m = jobs.length;
        int res[][]=new int[m][2];

        for (int i = 0; i<m; i++){
            res[i][0]=jobs[i][0];
            res[i][1]=jobs[i][1]*jobs[i][2];
        }

        for (int i = 0; i< m; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

        Arrays.sort(res, Comparator.comparingInt(row -> row[1]));

        for (int[] i : res) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();


        for (int i = m-1; i>= k -1; i--){
            System.out.print(res[i][0]+" ");
        }
    }
}


///job sequencing using brutforce approach