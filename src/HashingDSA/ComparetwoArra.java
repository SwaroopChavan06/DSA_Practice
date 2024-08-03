package HashingDSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ComparetwoArra {
    public static void main(String[] args) {
        Integer[] arr  ={1,2,5,4,0};
        Integer[] arrr  ={2,4,0,1, 5};
        HashMap<Integer, Integer> mp = new HashMap<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i : arr) {
            if (mp.containsKey(i)) {
                int fre = mp.get(i);
                fre++;
                mp.put(i, fre);
            } else {
                mp.put(i, 1);
            }
        }

        for (int i : arrr) {
            if (mpp.containsKey(i)) {
                int fre = mpp.get(i);
                fre++;
                mpp.put(i, fre);
            } else {
                mpp.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> hmt : mp.entrySet()) {
            if (!mpp.containsValue(hmt.getValue())) {
                System.out.println("flag");
            }
        }
    }
}
