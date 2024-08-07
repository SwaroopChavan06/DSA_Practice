package TreeDSA;

import java.util.LinkedList;
import java.util.Queue;

public class sumAllelement {
    static int sum = 0;

    static void sumElement(node root) {

        if (root == null) {
            return;
        }
        sum += root.data;
        sumElement(root.left);
        sumElement(root.right);
    }

    static int levelOreder(node root) {
        Queue<node> que = new LinkedList<>();
        que.add(root);
        int allsum=root.data;
        while (!que.isEmpty()) {

            node temp = que.poll();

            if (temp == null) {
                break;
            }
            if (root.left != null) {
                que.add(temp.left);
            }
            if (root.right != null) {
                que.add(temp.right);
            }
            allsum += temp.data;

        }
        return allsum;
    }

    static int treesumall(node root) {
        if (root == null) {
            return 0;
        }
        System.out.print(root.data+" ");
        return treesumall(root.right)+ root.data  + treesumall(root.left) ;
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.left.left.right = new node(6);
        root.left.right.left = new node(8);
        root.right.left = new node(21);
        root.right.right = new node(4);
        sumElement(root);
        System.out.println(sum);
        System.out.println(levelOreder(root));
        System.out.println(treesumall(root));
    }
}
