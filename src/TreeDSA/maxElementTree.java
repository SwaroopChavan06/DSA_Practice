package TreeDSA;

public class maxElementTree {
    static int max = 0;
    static int sum = 0;

    static void maxElement(node root) {

        if (root == null) {
            return;
        }
        if (root.data > max) {
            max = root.data;
        }
        maxElement(root.left);
        maxElement(root.right);
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

        maxElement(root);
        System.out.println(max);//max ele in BT
    }
}
