package PracticeQuestions;

public class RotateLinkedListEx5 {

    class Node1 {
        int data;
        Node1 next;
        Node1(int data) {
            this.data = data;
            next = null;
        }
    }

    Node1 head;

    void add(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    void rotate(int k){

        if(head == null || head.next == null){
            return;
        }
        while (k !=  0) {
            Node1 currNode = head;
            Node1 shift = currNode.next;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = head;
            head.next = null;
            head = shift;
            k--;
        }


    }
    void print() {
        Node1 currNode = head;
        while (currNode!= null){
            System.out.print(currNode.data + " ") ;
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {

//        10->20->30->40->50->60 k = 4 50->60->10->20->30->40.
        RotateLinkedListEx5 list = new RotateLinkedListEx5();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.print();
        System.out.println(" ");
        list.rotate(2);
        list.print();
    }
}
