package TreeDSA;

public class sumAllelement {
    static int sum=0;
    static void sumElement(node root) {

        if (root == null) {
            return;
        }
        sum +=root.data;
        sumElement(root.left);
        sumElement(root.right);
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
        sumElement(root);
        System.out.println(sum);//sum of all elements

    }
}
