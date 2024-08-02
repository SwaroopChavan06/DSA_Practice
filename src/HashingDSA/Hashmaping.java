package HashingDSA;

import java.util.HashMap;
import java.util.Map;

public class Hashmaping {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(10, "konkan");
        mp.put(null, null);
        mp.put(1, "pune");
        mp.put(12, "goa");
        mp.put(16, "kolhapur");
        mp.put(19, "latur");
        mp.put(25, "mumbai");

        System.out.println(mp);
        System.out.println(mp.size());
        mp.remove(16);
        System.out.println(mp);
        System.out.println(mp.size());

        for(Integer pt : mp.keySet()) {
            System.out.print(pt+ " ");
        }
        System.out.println();
        for(String str : mp.values()) {
            System.out.print(str+ " ");
        }

        System.out.println();
        System.out.println();

        for (Map.Entry<Integer, String> pt : mp.entrySet()){
            System.out.println(pt.getKey()+" "+pt.getValue());
        }
    }
}
