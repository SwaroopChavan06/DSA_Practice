package Stack;

import java.util.Stack;

public class ParenthesisStack {
    public static void main(String[] args) {
        String str = "{[(())]}()";
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{' ) {
                st.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (!st.isEmpty() && ((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']') || (st.peek() == '{' && ch == '}'))) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("Yes Parenthesis");
        } else {
            System.out.println("Not Parenthesis");
        }
    }
}
