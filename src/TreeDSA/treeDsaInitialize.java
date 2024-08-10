package TreeDSA;

public class treeDsaInitialize {
    static boolean findEle(Node root, int target) {
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

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");//preOrder
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");//postOrder
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);//
    }

    static int max = 0;
    static int sum = 0;

    static void maxElement(Node root) {

        if (root == null) {
            return;
        }
        if (root.data > max) {
            max = root.data;
        }
        maxElement(root.left);
        maxElement(root.right);
    }
    static void sumElement(Node root) {

        if (root == null) {
            return;
        }
        sum +=root.data;
        sumElement(root.left);
        sumElement(root.right);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.right = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        System.out.println(findEle(root, 1));//find element
        maxElement(root);
        System.out.println(max);//max ele in BT
        sumElement(root);
        System.out.println(sum);//sum of all elements


    }

}

