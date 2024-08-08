package TreeDSA;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {

    static void levelOreder(node root) {
        Queue<node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            node temp = que.poll();
            if (temp == null) {
                break;
            }
            System.out.println(temp.data + " ");
            if (root.left != null) {
                que.add(temp.left);
            }
            if (root.right != null) {
                que.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.left.left.right = new node(8);
        root.right.left = new node(6);
        root.right.right = new node(7);
        levelOreder(root);
    }
}
