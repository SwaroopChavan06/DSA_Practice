package HashingDSA;
//
//6 Given two arrays A[] and B[] consisting of n and m elements respectively.
// Find the minimum number of elements to remove from each array such that
// no common element exist in both.

//        Examples:
//Input : A[] = { 1, 2, 3, 4}
//B[] = { 2, 3, 4, 5, 8 }
//Output : 3
//We need to remove 2, 3 and 4 from any array.

//        Input : A[] = { 4, 2, 4, 4}
//B[] = { 4, 3 }
//Output : 1
//We need to remove 4 from B[]
//
//
//Input : A[] = { 1, 2, 3, 4 }
//B[] = { 5, 6, 7 }
//Output : 0
//There is no common element in both.


import java.util.HashMap;
import java.util.Map;

public class removeCommonEx6 {
    public static void main(String[] args) {
        Integer A[] = {1, 2, 3, 4};
        Integer B[] = {2, 3, 4, 5, 8};


        Map<Integer, Integer> map = new HashMap<>();

        for (int i : A) {
            map.put(i, 0);
        }
        int count = 0;
        for (int i : B) {
            if (map.containsKey(i)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
