package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MiddleElementQ {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.add(40);
        qu.add(50);
        qu.add(60);

        int size = qu.size();

        for (int i = 0; i < size; i++){
            if (i==size/2){
                System.out.println(qu.poll());
            }
            qu.poll();
        }

    }

}
