package HashingDSA;
//Given a matrix of distinct values and a sum. The task is to find all the pairs in a given
// matrix whose summation is equal to the given sum. Each element of a pair must be from
// different rows i.e; the pair must not lie in the same row.
//        Examples:
//Input : mat[4][4] = {{1, 3, 2, 4},{5, 8, 7, 6},{9, 10, 13, 11},{12, 0, 14, 15}}
//sum = 11
//Output: (1, 10), (3, 8), (2, 9), (4, 7), (11, 0)

import java.util.Map;

import java.util.HashMap;

public class sumPairEX5 {
    public static void main(String[] args) {
        Integer[][] mat = {
                {1, 3, 2, 4},
                {5, 8, 7, 6},
                {9, 10, 13, 11},
                {12, 0, 14, 15}
        };
        int targetSum = 11;

        Map<Integer, Integer> map = new HashMap<>();

        int row = mat.length;
        int column = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                map.put(mat[i][j], i);
            }
        }

        System.out.println(map);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int element = mat[i][j];
                int complement = targetSum - element;
                if (map.containsKey(complement) && map.get(complement) != i) {
                    System.out.println("(" + element + ", " + complement + ")");
                    map.remove(element);
                    map.remove(complement);
                }
            }
        }
    }
}
