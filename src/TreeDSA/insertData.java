//package TreeDSA;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class insertData {
//    node root;
//    void insertEle(int key){
//        node newNode = new node(key);
//        if (root == null) {
//            root = newNode;
//            return;
//        }
//
//        Queue<node> que = new LinkedList<>();
//        que.add(root);
//
//        while (!que.isEmpty()){
//            node temp = que.poll();
//            if (temp.left==null){
//                temp.left=newNode;
//                break;
//            }else {
//                que.add(temp.right);
//            }
//            if(temp.right==null){
//                temp.right=newNode;
//                break;
//            }else {
//                que.add(temp.right);
//            }
//        }
//    }
////    void deleteEle(int key){
////        node =[] = new node(key);
////        if (root == null) {
////            root = cur;
////            return;
////        }
//
////        Queue<node> que = new LinkedList<>();
////        que.add(root);
////
////        while (!que.isEmpty()){
////            node temp = que.poll();
////            if (temp.left==null){
////                temp.left= cur;
////                break;
////            }else {
////                que.add(temp.right);
////            }
////            if(temp.right==null){
////                temp.right= cur;
////                break;
////            }else {
////                que.add(temp.right);
////            }
////        }
////    }
////    static void preOrder(node root) {
////        if (root == null) {
////            return;
////        }
////        System.out.print(root.data + " ");//preOrder
////        preOrder(root.left);
////        preOrder(root.right);
////    }
////    public static void main(String[] args) {
////        insertData obj = new insertData();
////        obj.insertEle(5);
////        obj.insertEle(4);
////        obj.insertEle(2);
////        obj.insertEle(1);
////
////        preOrder(obj.root);
////    }
////}
