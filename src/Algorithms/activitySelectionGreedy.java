package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class activitySelectionGreedy {
    public static void main(String[] args) {
//        int[][] activities = {
//                {1, 2},
//                {3, 4},
//                {5, 6},
//                {7, 8}
//        };
//        int[][] activities = {
//                {1, 4},
//                {2, 6},
//                {5, 7},
//                {8, 9}
//        };
        int[][] activities = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 5}
        };

        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int lastEndTime = 0;

        for (int[] activity : activities) {
            if (activity[0] >= lastEndTime) {
                count++;
                lastEndTime = activity[1];
            }
        }
        System.out.println(count);

    }
}
