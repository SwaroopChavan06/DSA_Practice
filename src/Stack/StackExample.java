package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(st.peek());
//        System.out.println(st.isEmpty());

        while (!st.isEmpty()){
            System.out.println(st.peek()+" ");
            st.pop();
        }
    }
}
