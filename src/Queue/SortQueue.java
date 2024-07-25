package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SortQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();

        qu.add(50);
        qu.add(20);
        qu.add(90);
        qu.add(10);
        qu.add(40);

        while (!qu.isEmpty()){
            int temp = qu.poll();
            while (!stk.isEmpty() && stk.peek() > temp){
                qu.add(stk.pop());
            }
            stk.push(temp);
        }
        while (!stk.isEmpty()) {
            qu.add(stk.pop());
        }

        while (!qu.isEmpty()) {
            System.out.println(qu.poll());
        }


    }
}
