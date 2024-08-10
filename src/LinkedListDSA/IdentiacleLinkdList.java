package LinkedListDSA;

class Nodee {
    int data;
    Nodee next;

    Nodee(int data) {
        this.data = data;
        next = null;
    }
}

public class IdentiacleLinkdList {
    Nodee head;
    Nodee last;

    void insertAtEnd(int data) {
        Nodee newNode = new Nodee(data);
        if (head == null) {
            head = newNode;
            return;
        }
        last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    void PrintData() {
        Nodee last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;
        }
    }

    boolean areIdentical(Nodee head1, Nodee head2) {
        Nodee current1 = head1;
        Nodee current2 = head2;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return (current1 == null && current2 == null);
    }

    public static void main(String[] args) {
        IdentiacleLinkdList obj1 = new IdentiacleLinkdList();
        obj1.insertAtEnd(10);
        obj1.insertAtEnd(20);
        obj1.insertAtEnd(30);
        obj1.insertAtEnd(40);

        IdentiacleLinkdList obj2 = new IdentiacleLinkdList();
        obj2.insertAtEnd(10);
        obj2.insertAtEnd(20);
        obj2.insertAtEnd(30);
        obj2.insertAtEnd(40);


        System.out.println("List 1:");
        obj1.PrintData();
        System.out.println("List 2:");
        obj2.PrintData();

        if (obj1.areIdentical(obj1.head, obj2.head)) {
            System.out.println("Identical");
        } else {
            System.out.println("Not Identical");
        }
    }
}
