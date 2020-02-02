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
}