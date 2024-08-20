package HashingDSA;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentELe {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Integer[] arr  ={10, 20, 30, 20, 10, 20, 20, 10, 10, 10, 10};

        for (int i : arr) {
//            if (mp.containsKey(i)) {//to check the element is avialable or not
//                int fre = mp.get(i);//if available get the value of that key
//                fre++;//add that value
//                mp.put(i, fre);//again put that data into the hash map
//            } else {
//                mp.put(i, 1); //if not available just simply put that value into the hashmap
//            }

            mp.put(i, mp.getOrDefault(i, 0)+1);
        }

        System.out.println(mp);//print the map
        int max = 0;
        int secoundmax=0;
        int thirdmax=0;
        int ele = -1;

        for (Map.Entry<Integer, Integer> hmt : mp.entrySet()) {//get that full map entry into a map set
            if (hmt.getValue() > max) {

                //if entry set value is max than the valuue then update the max value

//                max=secoundmax;
//                secoundmax=thirdmax;

                max= hmt.getValue();
                ele = hmt.getKey();
            }
        }

        System.out.println(ele);
    }
}
