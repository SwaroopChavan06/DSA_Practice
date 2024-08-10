package LinkedListDSA;

class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data=data;
        next=null;
    }
}

public class InsertMiddleLinkedList {
    Node7 head;
    Node7 last;
    void Insertelement(int data){
        Node7 newNode = new Node7(data);
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

    void InsertatAnyPoint(int position, int data) {
        position--;
        Node7 newNode = new Node7(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node7 last = head;
        for (int i = 1; i < position && last != null; i++) {
            last = last.next;
        }
        if (last != null) {
            newNode.next = last.next;
            last.next = newNode;
        }
    }


    void PrintData(){
        int count=0;
        last= head;
        while (last!=null){
            count++;
            System.out.println(last.data);
            last=last.next;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        InsertMiddleLinkedList obj =new InsertMiddleLinkedList();
        obj.Insertelement(50);
        obj.Insertelement(60);
        obj.Insertelement(70);
        obj.Insertelement(80);
        obj.Insertelement(90);

        obj.InsertatAnyPoint(5, 10);

        obj.PrintData();
    }
}
