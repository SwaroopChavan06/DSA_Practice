package LinkedListDSA;

class NOdeei{
    int data;
    NOdeei next;
    NOdeei(int data){
        this.data=data;
        next=null;
    }
}


public class DeleteNode {

    NOdeei head;
    NOdeei last;


    void InsertADD(int data){
        NOdeei NewNode = new NOdeei(data);
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
    void DeleteNode(){

    }

    void PrintData() {
        NOdeei last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;
        }
    }

    public static void main(String[] args) {
        DeleteNode obj = new DeleteNode();
        obj.InsertADD(10);
        obj.InsertADD(20);
        obj.InsertADD(30);
        obj.InsertADD(40);
        obj.InsertADD(50);
//
//        NOdeee loopcreat = obj.head.next.next;
//        loopcreat.next = obj.head.next;
        System.out.println();

//        obj.printdataeleme();

        System.out.println();
    }


}
