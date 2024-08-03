package HashingDSA;
import java.lang.reflect.Array;
import java.util.HashSet;
public class HashingadditionInteger {
    public static void main(String[] args) {
        Integer[] arr ={0,10,11,6,4,5,3,2};
        HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> temp = new HashSet<>();

        for (int i : arr) {
            st.add(i);
        }

        int target = 10;
//        for (int i : st){
//            if(st.contains(target - i)){
//                System.out.println(i+ " "+ (target - i));
//            }
//        }
        for (int i : arr){
            int k = target - i;
            if(st.contains(k)){
                System.out.println(k+ " "+ i);
            }
            st.add(i);
        }
    }
}
