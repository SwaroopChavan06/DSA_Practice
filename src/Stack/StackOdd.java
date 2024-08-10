package Stack;

import java.util.Stack;

public class StackOdd {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= 10; i++) {
            stack.push(i);
        }


        System.out.println("Original stack: " + stack);


        System.out.println("Popping odd integers:");
        while (!stack.isEmpty()) {
            int top = stack.peek();
            if (top % 2 != 0) {
                System.out.println("Popped: " + stack.pop());
            } else {
                stack.pop();
            }
        }
    }
}