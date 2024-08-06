package HashingDSA;

import java.util.HashMap;
import java.util.Map;

//Input: word1 = "abc", word2 = "bca"
//Output: true
//Explanation: You can attain word2 from word1 in 2 operations.
//Apply Operation 1: "abc" -> "acb"
//Apply Operation 1: "acb" -> "bca"
//
//Input: word1 = "a", word2 = "aa"
//Output: false
//Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
//Example 3:
//
//Input: word1 = "cabbba", word2 = "abbccc"
//Output: true
//Explanation: You can attain word2 from word1 in 3 operations.
//Apply Operation 1: "cabbba" -> "caabbb"
//Apply Operation 2: "caabbb" -> "baaccc"
//Apply Operation 2: "baaccc" -> "abbccc"

public class Solution {
//    public static boolean closeStrings(String word1, String word2) {
//        if(word1.length()!=word2.length()){
//            return false;
//        }
//        Map<Character, Integer> map2 = new HashMap<>();
//        Map<Character, Integer> map1 = new HashMap<>();
//
//
//        for ( char c : word1){
//            if(map1.containsKey(c)){
//                int fre = map1.get(c);
//                fre++;
//                map1.put(c, fre);
//            }else {
//                map1.put(c, 1);
//            }
//        }
//    }

    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";
//        boolean ans = closeStrings(word1, word2);
//        System.out.println(ans);
//        if(word1.length()!=word2.length()){
//            return false;
//        }
        Map<Character, Integer> map2 = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();

int i = 0;
        for ( char c : word1.charAt()){
            if(map1.containsKey(c)){
                int fre = map1.get(c);
                fre++;
                map1.put(c, fre);
            }else {
                map1.put(c, 1);
            }
            i++;
        }
        System.out.println(map1);
    }
}
