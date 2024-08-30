package Algorithms;

public class jobSequencingProblem {
    public static void main(String[] args) {
        int[][] jobs={
                {0,4,20},
                {1,1,10},
                {2,1,40},
                {3,1,30}
        };

//        int[][] jobs={
//                {0,2,100},
//                {1,1,19},
//                {2,2,27},
//                {3,1,25},
//                {4,3,15},
//        };
        int m = jobs.length;
        int res[][]=new int[m][2];

        for (int i = 0; i<m; i++){
            res[i][1]=jobs[i][1]*jobs[i][2];
        }

        for (int i = 0; i< m; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(res);
            }
        }






    }
}
