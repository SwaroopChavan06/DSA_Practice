package TreeDSA;

public class searchElement {
    static boolean findEle(node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        if (findEle(root.left, target)) {
            return true;
        } else if (findEle(root.right, target)) {
            return true;
        } else {
            return false;
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
        System.out.println(findEle(root, 1));//find element
    }
}
