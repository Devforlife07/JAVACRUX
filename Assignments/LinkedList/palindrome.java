import java.util.*;

class palindrome {
    static Scanner sc = new Scanner(System.in);

    static class node {
        node prev;
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static String forw = "";
    static String rev = "";
    static private node head = null;
    static private node tail = null;
    static private int size = 0;

    public static void add(int data) {
        node n = new node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    public static void display(node head) {
        if (head == null) {
            // System.out.println("Linked List Is Empty");
            return;
        }
        // System.out.println("Forward-----");
        node temp = head;
        while (temp != null) {
            // System.out.print(temp.data + " ");
            forw += temp.data;
            temp = temp.next;
        }
    }

    public static void reversedisplay(node tail) {
        if (tail == null) {
            // System.out.println("Linked List Is Empty");
            return;
        }
        // System.out.println("Reverse-----");

        node temp = tail;
        while (temp != null) {
            // System.out.print(temp.data + " ");
            rev += temp.data;
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            add(sc.nextInt());
        }
        // System.out.println("Size=" + size);
        display(head);
        reversedisplay(tail);
        if (forw.equals(rev))
            System.out.println("True");
        else
            System.out.println("False");
    }

}