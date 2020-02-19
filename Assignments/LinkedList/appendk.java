import java.util.*;

class appendk {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static node head = null;
    private static int size = 0;
    private static node tail = null;

    static Scanner sc = new Scanner(System.in);

    static void add(int data) {
        node n = new node(data);
        if (head == null) {
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
    }

    static node cal(node head, int k) {
        node temp = head;
        int i = 1;
        if (k == size || k == 0 || k > size)
            return head;
        while (i != (size - k)) {
            temp = temp.next;
            i++;
        }
        node ahead = temp.next;
        tail.next = head;

        head = ahead;
        temp.next = null;
        return head;
    }

    static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        size = n;

        for (int i = 1; i <= n; i++) {
            add(sc.nextInt());
        }
        int k = sc.nextInt();
        k = k % n;
        head = cal(head, k);
        display(head);
    }
}