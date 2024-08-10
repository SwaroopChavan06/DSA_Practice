package LinkedListDSA;

class Node3 {
    int data;
    Node3 next;
    Node3(int data) {
        this.data = data;
        next = null;
    }
}

public class SumLinkdList {
    Node3 head;
    Node3 last;
    int count=0;
    int sum=0;

    SumLinkdList() {
        head = null;
    }


    void insertAtEnd(int data){
        Node3 newNode= new Node3(data);
        count++;
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

    int Sum(){
        Node3 last=head;
        while(last!=null){
            sum = sum+ last.data;
            last=last.next;
        }
        return sum;
    }

    void PrintData(){
        Node3 last=head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
        System.out.println("Length of the linked list: "+count);
        System.out.println("Sum of the linked list: "+ Sum());
    }

    public static void main(String[] args) {
        SumLinkdList lk= new SumLinkdList();
        lk.insertAtEnd(10);
        lk.insertAtEnd(30);
        lk.insertAtEnd(50);
        lk.insertAtEnd(70);

        System.out.println();
        System.out.println();
        lk.PrintData();

    }

}

