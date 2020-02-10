import java.util.*;

class linkedlist {
    private class node {
        int data;
        node next;
    }

    private node head;
    private int size;
    private node tail;

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void addAtLast(int item) {
        node nn = new node();
        nn.next = null;
        nn.data = item;
        if (this.size >= 1)
            this.tail.next = nn;
        if (this.size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            this.tail = nn;
            size++;
        }
    }

    public int getLast() {
        node temp = this.tail;
        if (this.size == 0)
            return -1;
        else {
            return temp.data;
        }
    }

    public int getFirst() {
        node temp = head;
        if (temp == null)
            return -1;
        else {
            return temp.data;
        }
    }

    private node getnodeat(int n) throws Exception {
        if (this.size == 0)
            throw new Exception("Linked List Is Empty");
        if (n < 0 || n > this.size)
            throw new Exception("Invalid Index");
        else {
            node temp = head;
            int i;
            for (i = 0; i < n; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    public int getat(int n) throws Exception {
        if (this.size == 0)
            throw new Exception("Linked List Is Empty");
        if (n < 0 || n >= this.size)
            throw new Exception("Invalid Index");
        else {
            node temp = head;
            int i;
            for (i = 0; i < n; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void addAtFirst(int item) {
        node nn = new node();
        nn.next = null;
        nn.data = item;
        if (size >= 1) {
            nn.next = head;
        }

        if (this.size == 0)

        {
            head = nn;
            tail = nn;
            this.size++;
        } else {
            this.size++;
            this.head = nn;

        }

    }

    public void addat(int item, int index) throws Exception {
        if (index < 0 || index > size)
            throw new Exception("Invalid Index");
        if (index == 0)
            addAtFirst(item);
        else if (index == size)
            addAtLast(item);
        else {
            node nn = new node();
            nn.data = item;
            nn.next = null;
            node nm1 = getnodeat(index - 1);
            nn.next = nm1.next;
            nm1.next = nn;
            this.size++;
        }

    }

    // O(1)
    public int removefirst() throws Exception {
        if (this.size == 0)
            throw new Exception("Linked List Is Empty");
        if (this.size == 1) {
            int item = head.data;
            head = null;
            tail = null;
            this.size = 0;
            return item;

        } else {
            int item = head.data;
            head = head.next;
            this.size--;
            return item;
        }
    }

    // O(1)
    public int removelast() throws Exception {
        if (this.size == 0)
            throw new Exception("Linked List Is Empty");
        else if (this.size == 1) {
            int item = head.data;
            this.head = null;
            this.tail = null;
            this.size = 0;
            return item;
        } else {
            int item = this.tail.data;
            node nm2 = getnodeat(size - 2);
            this.tail = nm2;
            this.tail.next = null;
            this.size--;
            return item;
        }
    }

    public void reverseData() throws Exception {
        int left = 0;
        int right = this.size - 1;
        while (left < right) {
            node l = getnodeat(left);
            node r = getnodeat(right);
            int temp = l.data;
            l.data = r.data;
            r.data = temp;
            left++;
            right--;
        }
    }

}