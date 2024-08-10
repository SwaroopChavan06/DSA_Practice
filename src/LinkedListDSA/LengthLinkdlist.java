package LinkedListDSA;

class Node2 {
    int data;
    Node2 next;
    Node2(int data) {
        this.data = data;
        next = null;
    }
}

public class LengthLinkdlist {
    Node2 head;
    Node2 last;
    int count=0;
    LengthLinkdlist() {
        head = null;
    }


    void insertAtEnd(int data){
        Node2 newNode= new Node2(data);
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

    int Count(){
        Node2 last=head;
        while(last!=null){
            count++;
            last=last.next;
        }
        return count;
    }

    void PrintData(){
        Node2 last=head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
        System.out.println("Length of the linked list: "+Count());
    }

    public static void main(String[] args) {
        LengthLinkdlist lk= new LengthLinkdlist();
        lk.insertAtEnd(10);
        lk.insertAtEnd(30);
        lk.insertAtEnd(50);
        lk.insertAtEnd(70);

        System.out.println();
        System.out.println();
        lk.PrintData();
    }
}
