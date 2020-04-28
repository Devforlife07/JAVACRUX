import java.util.*;

/**
 * circularLinkedList
 */
public class circularLinkedList {
    class cllnode {
        int data;
        cllnode next;
    }

    protected cllnode tail;
    int length;

    circularLinkedList() {
        tail = null;
        length = 0;
    }

    public void addToHead(int data) {
        cllnode temp = new cllnode();
        temp.data = data;
        if (tail == null) {
            tail = temp;
            tail.next = tail;
        } else {
            temp.next = tail.next;
            tail.next = temp;
        }
        this.length++;
    }

    public void addToLast(int data) {

        addToHead(data);
        tail = tail.next;
    }

    public int length() {
        return this.length;
    }

    public void display() {
        cllnode curr = tail.next;
        while (curr != tail) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(tail.data);
    }

    public int removeHead() {
        if (tail == tail.next) {
            int data = tail.data;
            tail = null;
            return data;
        } else {
            cllnode temp = tail.next;
            tail.next = temp.next;
            this.length--;
            return temp.data;

        }
    }

    public boolean contains(int data) {
        if (tail == null)
            return false;
        cllnode temp = tail.next;
        while (temp != tail && !(temp.data == data)) {
            temp = temp.next;
        }
        return temp.data == data;

    }

    public int removeTail() {
        if (tail == tail.next) {
            int data = tail.data;
            tail = null;
            return data;
        } else {
            cllnode curr = tail;
            while (curr.next != tail) {
                curr = curr.next;
            }
            cllnode temp = tail;
            curr.next = temp.next;
            tail = curr;
            return temp.data;

        }
    }

    public static void main(String[] args) {

        circularLinkedList ll = new circularLinkedList();
        ll.addToHead(5);
        ll.addToHead(6);
        ll.addToLast(7);
        ll.addToHead(8);
        ll.addToLast(17);
        // ll.removeHead();
        System.out.println("Removed Last Node=" + ll.removeTail());
        System.out.println(ll.contains(5));
        System.out.println(ll);
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public String toString() {
        String res = "[";
        if (tail == null)
            return res += "]";
        res += tail.data + ",";
        cllnode temp = tail.next;
        while (temp != tail) {
            res += temp.data + ",";
            temp = temp.next;
        }
        return res += "]";
    }

}