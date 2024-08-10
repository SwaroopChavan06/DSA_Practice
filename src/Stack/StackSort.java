package Stack;

import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        stk.push(2);
        stk.push(3);
        stk.push(5);
        stk.push(1);
        stk.push(6);
        stk.push(4);

        while (!stk.isEmpty()) {
            int current = stk.pop();
            while (!temp.isEmpty() && temp.peek() < current ) {
                 stk.push(temp.pop());
            }
            temp.push(current);
        }
        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }
    }
}
