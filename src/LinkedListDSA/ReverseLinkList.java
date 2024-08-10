package LinkedListDSA;

public class ReverseLinkList {
    Nodee head;
    Nodee last;

    void InsertADD(int data){
        Nodee NewNode = new Nodee(data);
        if (head==null){
            head=NewNode;
            return;
        }
        last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=NewNode;
    }
    void printdataeleme(){
        Nodee last = head;
        while (last != null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    void searchElement(int val){
        boolean flag=false;
        Nodee last = head;
        int count = 0;
        while (last != null){
            count++;
            if (last.data==val){
                flag=true;
                break;
            }
            last=last.next;
        }
        if(flag==true){
            System.out.println("Element Found at index "+count);
        }else {
            System.out.println("Element Not Found");
        }
    }

    void revese() {
        Nodee pvrnode=null;
        Nodee last=head;
        Nodee next;
        while (last!=null){
            next=last.next;
            last.next=pvrnode;
            pvrnode=last;
            last=next;
        }
        head=pvrnode;
    }

    public static void main(String[] args) {
        ReverseLinkList obj = new ReverseLinkList();
        obj.InsertADD(10);
        obj.InsertADD(20);
        obj.InsertADD(30);
        obj.InsertADD(40);
        obj.InsertADD(50);

        obj.printdataeleme();

        obj.searchElement(80);



    }
}
