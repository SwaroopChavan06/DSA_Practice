package Stack;

import java.util.Stack;

public class NextGretestNum {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> result = new Stack<>();

        stk.push(2);
        stk.push(1);
        stk.push(6);
        stk.push(7);
        stk.push(8);
        stk.push(3);
        stk.push(4);

        while (!stk.isEmpty()) {
            int num = stk.pop();
            while (!result.isEmpty() && result.peek() < num) {
                result.pop();
            }

            if (result.isEmpty()) {
                System.out.println(num + " -> " + -1);
            } else {
                System.out.println(num + " -> " + result.peek());
            }
            result.push(num);
        }
//        while (!result.isEmpty()){
//            System.out.println(result.pop());
//        }
    }

}

//Input-> 2, 1, 6, 7;
//Output-> 2 -> 6
//        1 -> 6
//        6 -> 7
//        7 -> -1