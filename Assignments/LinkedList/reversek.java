import java.util.*;

class reversek {
    static Scanner sc = new Scanner(System.in);
    private static node head = null;
    private static node tail = null;
    private static int size = 0;

    static class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static void add(int data) {
        node n = new node(data);
        if (head == null) {
            head = n;
            tail = n;
            size++;
            return;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    public static void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static node reverse(node head, int k) {
        node curr = head;
        node prev = null;
        node ahead = null;
        int count = 1;
        while (count <= k && curr != null) {
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
            count++;
        }
        if (ahead != null)
            head.next = reverse(ahead, k);
        return prev;

    }

    public static void main(final String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            add(sc.nextInt());
        }
        // display();
        head = reverse(head, k);
        // System.out.println("After Reversing");
        display();
    }
}