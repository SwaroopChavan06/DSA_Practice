package PracticeQuestions;

public class MargeLinkedList {

    class Node2 {

        int data;
        Node2 next;
        Node2(int data) {
            this.data = data;
            next = null;
        }
    }

    Node2 head;
    Node2 addNode;
    int length = 0;

    void add(int data) {
        length++;
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node2 currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    int delFirst() {

        length--;

        if (head == null) {
            return -1;
        }

        if(head.next == null){
            int d = head.data;
            head = null;
            return d;

        }

        int data = head.data;
        Node2 currNode = head;
        head = currNode.next;

        return data;
    }

    void addAlternate(int data) {
        length++;
        Node2 newNode = new Node2(data);

        if (addNode == null) {
            addNode = head.next;
            head.next = newNode;
            newNode.next = addNode;
            return;
        }

        Node2 currNode = addNode;

        addNode = currNode.next;
        currNode.next = newNode;
        newNode.next = addNode;
    }

    void print() {
        Node2 currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " - > ");
            currNode = currNode.next;
        }
    }

    int size() {
        return length;
    }

    public static void main(String[] args) {

        MargeLinkedList list = new MargeLinkedList();
//        5->7->17->13->11
        list.add(5);
        list.add(7);
        list.add(17);
        list.add(13);
        list.add(11);

        list.print();

        MargeLinkedList list2 = new MargeLinkedList();

        System.out.println();
        //    12->10->2->4->6

        list2.add(12);
        list2.add(10);
        list2.add(2);
        list2.add(4);
        list2.add(6);

        list2.print();

        int length = list.size();
        while (length > 0){

            int data = list2.delFirst();
            list.addAlternate(data);

            length--;
        }


        System.out.println();
        list.print();
        System.out.println();
        list2.print();

    }

}
