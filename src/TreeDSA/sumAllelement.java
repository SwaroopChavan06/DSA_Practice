package TreeDSA;

import java.util.LinkedList;
import java.util.Queue;

public class sumAllelement {
    static int sum = 0;

    static void sumElement(Node root) {

        if (root == null) {
            return;
        }
        sum += root.data;
        sumElement(root.left);
        sumElement(root.right);
    }

    static int levelOreder(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int allsum=root.data;
        while (!que.isEmpty()) {

            Node temp = que.poll();

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

    static int treesumall(Node root) {
        if (root == null) {
            return 0;
        }
        System.out.print(root.data+" ");
        return treesumall(root.right)+ root.data  + treesumall(root.left) ;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.right = new Node(6);
        root.left.right.left = new Node(8);
        root.right.left = new Node(21);
        root.right.right = new Node(4);
        sumElement(root);
        System.out.println(sum);
        System.out.println(levelOreder(root));
        System.out.println(treesumall(root));
    }
}
