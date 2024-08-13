package TreeDSA.BinarySearchTree;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
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

    // Method to delete a node with the given key from the BST
    public void delete(int key) {
        root = deleteNode(root, key);
    }

    // Recursive helper method to delete a node with the given key from the BST
    private TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    private int minValue(TreeNode root) {
        int minVal = root.val;
        while (root.left != null) {
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
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

        bst.delete(25);

        System.out.println("Inorder traversal of the BST:");
        bst.inorderTraversal();

    }
}