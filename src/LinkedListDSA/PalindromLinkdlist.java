package LinkedListDSA;

class Node4 {
    int data;
    Node4 next;
    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromLinkdlist {
    Node4 head;
    int count = 0;

    void InsertAtEnd(int data) {
        Node4 newNode = new Node4(data);
        count++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node4 last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    void PrintLK() {
        Node4 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
        System.out.println("Count: " + count);
    }

    Node4 reverseList() {
        Node4 prev = null;
        Node4 current = head;
        while (current != null) {
            Node4 newNode = new Node4(current.data);
            newNode.next = prev;
            prev = newNode;
            current = current.next;
        }
        return prev;
    }

    boolean isPalindrome() {
        Node4 reversedHead = reverseList();
        Node4 originalCurrent = head;
        Node4 reversedCurrent = reversedHead;

        while (originalCurrent != null && reversedCurrent != null) {
            if (originalCurrent.data != reversedCurrent.data) {
                return false;
            }
            originalCurrent = originalCurrent.next;
            reversedCurrent = reversedCurrent.next;
        }
        return true;
    }

    void PalindromOrNot() {
        if (isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromLinkdlist obj = new PalindromLinkdlist();
        obj.InsertAtEnd(10);
        obj.InsertAtEnd(20);
        obj.InsertAtEnd(30);
        obj.InsertAtEnd(20);
        obj.InsertAtEnd(10);

        obj.PrintLK();
        obj.PalindromOrNot();
    }
}
