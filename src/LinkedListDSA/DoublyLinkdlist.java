package LinkedListDSA;

class noode{
    int data;
    noode next;
    noode pre;
    noode(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }
}

public class DoublyLinkdlist {
    noode head;
    noode last;
    noode prev;

    void insertatend(int data){
        noode newNode = new noode(data);
        if(head==null){
            head = newNode;
            return;
        }
        last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        newNode.pre=last;
        last= newNode;
    }

    void printdataall(){
        last=head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    void travelseback(int time){
        if(head==null){
            System.out.println("no element");
            return;
        }
        last = head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkdlist obj = new DoublyLinkdlist();
        obj.insertatend(10);
        obj.insertatend(20);
        obj.insertatend(30);
        obj.insertatend(40);
        obj.insertatend(50);

        obj.printdataall();

        obj.travelseback(2);

    }
}
