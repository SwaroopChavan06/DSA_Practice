package HashingDSA;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentELe {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Integer[] arr  ={10, 20, 30, 20, 10, 20, 20, 10, 10, 10, 10};

        for (int i : arr) {
            if (mp.containsKey(i)) {
                int fre = mp.get(i);
                fre++;
                mp.put(i, fre);
            } else {
                mp.put(i, 1);
            }
        }

        System.out.println(mp);
        int max = 0;
        int ele = -1;

        for (Map.Entry<Integer, Integer> hmt : mp.entrySet()) {
            if (hmt.getValue() > max) {
                max = hmt.getValue();
                ele = hmt.getKey();
            }
        }

        System.out.println(ele);
    }
}
