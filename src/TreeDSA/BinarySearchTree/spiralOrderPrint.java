package TreeDSA.BinarySearchTree;

import TreeDSA.Node;

import java.util.LinkedList;
import java.util.Queue;

public class spiralOrderPrint {
    TreeNode root;

    public spiralOrderPrint() {
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

    static void SpiralOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        TreeNode temp = que.poll();
        if (temp == null) {
            return;
        }
        int level=0;
        System.out.println(temp.val + " ");
        while (!que.isEmpty()) {
            if(level%2==0){
                System.out.println(temp.val + " ");
                if (root.left != null) {
                    que.add(temp.left);
                }
                if (root.right != null) {
                    que.add(temp.right);
                }
            }else {
                System.out.println(temp.val + " ");
                if (root.right != null) {
                    que.add(temp.right);
                }
                if (root.left != null) {
                    que.add(temp.left);
                }
            }
            level++;
        }
    }

    public static void main(String[] args) {
        spiralOrderPrint bst = new spiralOrderPrint();
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
        System.out.println("/////////////////////////////");
        bst.SpiralOrder(bst.root);
    }
}

//wap to print the all the leaf nodes
//wap to print bottom view of a tree
//wap to print a tree in a spiral oreder even odd level wise
//wap to print a tree to delete a node
//
