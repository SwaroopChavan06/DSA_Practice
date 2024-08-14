package TreeDSA.BinarySearchTree;

import TreeDSA.Node;

public class lowestCommonAnchester {
    TreeNode root;

    public lowestCommonAnchester() {
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
    //lowercomenanchester
    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + "-> ");
            inorder(root.right);
        }

    }

    public void lowestcm(int a, int b) {
        TreeNode lca = comonanchester(root, a, b);
        if (lca != null) {
            System.out.println(lca.val);
        }
    }

    private TreeNode comonanchester(TreeNode root, int a, int b) {
        if (root == null) {
            return null;
        }

        if (root.val > a && root.val > b) {
            return comonanchester(root.left, a, b);
        }
        if (root.val < a && root.val < b) {
            return comonanchester(root.right, a, b);
        }
        return root;
    }

    public static void main(String[] args) {
        lowestCommonAnchester bst = new lowestCommonAnchester();

        bst.insert(20);
        bst.insert(32);
        bst.insert(30);
        bst.insert(35);
        bst.insert(31);
        bst.insert(28);
        bst.insert(26);
        bst.insert(29);
        bst.insert(25);
        bst.insert(12);
        bst.insert(5);
        bst.insert(4);
        bst.insert(8);
        bst.insert(18);
        bst.insert(15);

        System.out.println("Inorder traversal of the BST:");
        bst.inorderTraversal();
        System.out.println("hii");
        bst.lowestcm(28, 35);
    }
}

//wap to print the all the leaf nodes
//wap to print bottom view of a tree
//wap to print a tree in a spiral oreder even odd level wise
//wap to print a tree to delete a node
//