package HashingDSA;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Count frequency of each character in word1
        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // Count frequency of each character in word2
        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Check if both strings have the same set of characters
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        // Check if both strings have the same frequency counts (ignore character identity)
        // We can do this by comparing the frequency distributions
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int count : map1.values()) {
            freq1[count]++;
        }

        for (int count : map2.values()) {
            freq2[count]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";
        boolean ans = closeStrings(word1, word2);
        System.out.println(ans);  // Output: true
    }
}
