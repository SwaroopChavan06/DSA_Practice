package LinkedListDSA;

class NOdeee{
    int data;
    NOdeee next;
    NOdeee(int data){
        this.data=data;
        next=null;
    }
}
public class LoopLkList {
    NOdeee head;
    NOdeee last;


    void InsertADD(int data){
        NOdeee NewNode = new NOdeee(data);
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
        NOdeee last = head;
        while (last != null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    boolean isLoop() {
        NOdeee slow = head;
        NOdeee fast = head;
        boolean flag = false;
        int count=0;

        while (slow != null && fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                count++;
                flag = true;
                break;
            }
        }
        System.out.println(count);
        return flag;
    }

    public static void main(String[] args) {
        LoopLkList obj = new LoopLkList();
        obj.InsertADD(10);
        obj.InsertADD(20);
        obj.InsertADD(30);
        obj.InsertADD(40);
        obj.InsertADD(50);

        NOdeee loopcreat = obj.head.next.next;
        loopcreat.next = obj.head.next;

//        obj.printdataeleme();

        System.out.println(obj.isLoop());
    }

}
