package TreeDSA.BinarySearchTree;

public class findRootElement {
    TreeNode root;

    public findRootElement() {
        root = null;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    private TreeNode insertNode(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.val) {
            root.left = insertNode(root.left, key);
        } else if (key > root.val) {
            root.right = insertNode(root.right, key);
        }

        return root;
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + "-> ");
            inorder(root.right);
        }

    }
    public boolean find(int key) {
        return findNode(root, key);
    }

    // Recursive helper method to find an element in the BST
    private boolean findNode(TreeNode root, int key) {
        if (root == null) {
            return false;
        }

        if (root.val == key) {
            return true;
        } else if (key < root.val) {
            return findNode(root.left, key);
        } else {
            return findNode(root.right, key);
        }
    }

    public static void main(String[] args) {
        findRootElement bst = new findRootElement();
        bst.insert(25);
        bst.insert(12);
        bst.insert(5);
        bst.insert(4);
        bst.insert(8);
        bst.insert(18);
        bst.insert(15);
        bst.insert(20);
        bst.insert(32);
        bst.insert(30);
        bst.insert(35);
        bst.insert(31);
        bst.insert(28);
        bst.insert(26);
        bst.insert(29);

        System.out.println("Inorder traversal of the BST:");
        bst.inorderTraversal();
        System.out.println();
        System.out.println(bst.find(35));

    }
}
