package HashingDSA;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();

        st.add(12);
        st.add(16);
        st.add(18);
        st.add(20);
        st.add(22);
        st.add(26);
        st.add(20);



        st.remove(26);
        System.out.println(st.contains(22));
        System.out.println(st);

        for (int i : st){
            System.out.println(i);
        }



    }
}
