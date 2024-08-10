package LinkedListDSA;

class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data=data;
        next=null;
    }
}

public class MiddleElement {

    Node6 head;
    Node6 last;
    int count = 0;


    void InsertELement(int data){
        Node6 newNode = new Node6(data);
        count++;
        if (head==null){
            head=newNode;
            return;
        }
        last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }

    int middleelementnum(int count){
        return (count/2)+1;
    }

    void PrintELement(){
        Node6 last = head;
        int n=middleelementnum(count);
        for (int i = 1; i<=n; i++) {
            if(i==n) {
                System.out.println(last.data);
            }
            last = last.next;
        }
        System.out.println(count);
        System.out.println(n);
    }

    int middleelement(){
        Node6 slow= head;
        Node6 fast=  head;
        while (slow != null && fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }


    public static void main(String[] args) {
        MiddleElement obj = new MiddleElement();
        obj.InsertELement(50);
        obj.InsertELement(60);
        obj.InsertELement(70);
        obj.InsertELement(80);
        obj.InsertELement(90);


        System.out.println(obj.middleelement());
        obj.PrintELement();
    }
}
