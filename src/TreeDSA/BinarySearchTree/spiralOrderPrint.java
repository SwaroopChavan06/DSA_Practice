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


    static int HeightNode(Node root){
        if(root==null){
            return 0;
        }
        int lheight=HeightNode(root.left);
        int rheight=HeightNode(root.right);
        return 1+Math.max(lheight, rheight);
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
import java.util.Arrays;

public class ChocolateDistribution {

    public static int findMinDiff(int[] arr, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }

        Arrays.sort(arr);

        if (n < m) {
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];

            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 2, 4, 9, 12, 56};
        int m1 = 3;
        System.out.println("Minimum difference is " + findMinDiff(arr1, arr1.length, m1));

        int[] arr2 = {3, 4, 1, 9, 56, 7, 9, 12};
        int m2 = 5;
        System.out.println("Minimum difference is " + findMinDiff(arr2, arr2.length, m2));


        sdfsf
        int[] arr3 = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m3 = 7;
        System.out.println("Minimum difference is " + findMinDiff(arr3, arr3.length, m3));
    }
}
