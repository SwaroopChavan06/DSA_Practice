package HashingDSA;
//Non-overlapping sum of two sets
//Given two arrays A[] and B[] of size n. It is given that both array
// individually contains distinct elements. We need to find the sum of all
// elements that are not common.
//        Examples:
//Input : A[] = {1, 5, 3, 8}
//B[] = {5, 4, 6, 7}
//Output : 29
//        1 + 3 + 4 + 6 + 7 + 8 = 29
//
//Input : A[] = {1, 5, 3, 8}
//B[] = {5, 1, 8, 3}
//Output : 0
//All elements are common.
//

import java.util.HashMap;
import java.util.Map;

public class nonOverlappingSumEX7 {
    public static void main(String[] args) {
        Integer[] a = {1, 5, 3, 8};
//        Integer[] b = {5, 4, 6, 7};
        Integer[] b = {5, 1, 8, 3};
        Map<Integer, Integer> set = new HashMap<>();

        int sum = 0;
        for (int i = 0; i< a.length; i++){
            set.put(a[i], 0);
        }
        for (int i = 0; i< b.length; i++){
            if(set.containsKey(b[i])){
               set.remove(b[i]);
            }else {
                sum+=b[i];
            }
        }
        for (int i : set.keySet()){
            sum +=i;
        }
        System.out.println(sum);



    }
}
