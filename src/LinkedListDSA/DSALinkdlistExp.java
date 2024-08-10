package LinkedListDSA;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class DSALinkdlistExp {
    Node head;
    Node last;

    DSALinkdlistExp() {
        head = null;
    }

    void insertAtFront(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
//            System.out.println(head.data);
            return;
        }
        newNode.next = head;
        head = newNode;
//        System.out.println(head.data);
    }

    void insertAtEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }

    void PrintData(){
        Node last=head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    public static void main(String[] args) {
        DSALinkdlistExp lk= new DSALinkdlistExp();
        lk.insertAtEnd(10);
        lk.insertAtEnd(30);
        lk.insertAtEnd(50);
        lk.insertAtEnd(70);
        lk.insertAtFront(20);
        lk.insertAtFront(40);
        lk.insertAtFront(60);

        System.out.println();
        System.out.println();
        lk.PrintData();
    }
}
