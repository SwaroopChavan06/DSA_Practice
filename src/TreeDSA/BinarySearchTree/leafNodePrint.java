
package TreeDSA.BinarySearchTree;

import TreeDSA.Node;

public class leafNodePrint {
    TreeNode root;

    public leafNodePrint() {
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

    public void leafnode() {
        TreeNode leaf = leafnodeprnt(root);
    }

    private TreeNode leafnodeprnt(TreeNode root) {
        if (root == null) {
            return null;
        }
        if(root.left==null && root.right == null){
            System.out.println(root.val);
        }
        leafnodeprnt(root.left);
        leafnodeprnt(root.right);
        return root;
    }

    public static void main(String[] args) {
        leafNodePrint bst = new leafNodePrint();
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
        System.out.println("hii");
        bst.leafnode();
    }
}

//wap to print the all the leaf nodes
//wap to print bottom view of a tree
//wap to print a tree in a spiral oreder even odd level wise
//wap to print a tree to delete a node
//