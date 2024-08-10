package TreeDSA;

import java.util.LinkedList;
import java.util.Queue;

public class insertData {
    Node root;

    void insertEle(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Node temp = que.poll();
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                que.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                que.add(temp.right);
            }
        }
    }

    void deleteEle(int key) {
        if (root == null) {
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        Node keyNode = null;
        Node temp = null;

        while (!que.isEmpty()) {
            temp = que.poll();

            if (temp.data == key) {
                keyNode = temp;
            }

            if (temp.left != null) {
                que.add(temp.left);
            }

            if (temp.right != null) {
                que.add(temp.right);
            }
        }

        if (keyNode != null) {
            int x = temp.data;
            deleteDeepest(temp);
            keyNode.data = x;
        }
    }

    void deleteDeepest(Node delNode) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        Node temp;

        while (!que.isEmpty()) {
            temp = que.poll();

            if (temp == delNode) {
                temp = null;
                return;
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    que.add(temp.right);
                }
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    que.add(temp.left);
                }
            }
        }
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        insertData obj = new insertData();
        obj.insertEle(5);
        obj.insertEle(4);
        obj.insertEle(2);
        obj.insertEle(1);

        preOrder(obj.root);
        System.out.println();

        obj.deleteEle(4);
        preOrder(obj.root);
    }
}




//WAP to find the right most element of tree