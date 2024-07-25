package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueConstr {
    public static void main(String[] args) {
        Queue<Integer> qu = new PriorityQueue<>();

        qu.add(100);
        qu.add(280);
        qu.add(180);
        qu.add(390);

        qu.add(60);
        qu.add(200);

        while (!qu.isEmpty()){
            System.out.println(qu.poll());
        }
    }
}
//find the middle element of the queu
//implement queue using stack
//sort a queue using a temp stack
//implement stack with the help of array
//implement queue with the help of array
//implement stack with the help of Linkdlist
//implement queue with the help of Linkdlist