import java.util.*;

/**
 * merge
 */
public class merge {
    static private node head, head1 = null, head2 = null, tail;
    static private long i = 0, c1 = 0, c2 = 0, n1, n2, size = 0;
    static Scanner sc = new Scanner(System.in);

    static class node {
        long data;
        node next;

        node(long data) {
            this.data = data;
            this.next = null;
        }
    }

    private static node add(node head, long data) {
        node n = new node(data);
        node temp = head;
        if (head == null) {
            head = n;
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        return head;
    }

    private static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static node getnodeat(node head, long i) {
        long c = 0;
        node temp = head;
        while (c < i) {
            temp = temp.next;
            c++;
        }

        return temp;
    }

    private static node merge(node list1, node list2) {
        if (head1 == null)
            head = head2;
        if (head2 == null)
            head = head1;
        node head3;
        if (head1.data < head2.data) {
            head3 = head1;
            head1 = head1.next;
        } else {
            head3 = head2;
            head2 = head2.next;
        }
        node current = head3;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 == null) {
            current.next = head2;
        } else {
            current.next = head1;
        }
        return head3;
    }
    // private static void merge() {
    // long i = 0;

    // while (i < (n1 + n2)) {

    // if (c1 == (n1)) {
    // node t = getnodeat(head, i - 1);

    // node l = getnodeat(head2, c2);

    // t.next = l;

    // break;
    // } else if (c2 == (n2)) {
    // node t = getnodeat(head, i - 1);
    // node l = getnodeat(head1, c1);

    // t.next = l;

    // break;
    // } else {
    // node temp1 = getnodeat(head1, c1);
    // node temp2 = getnodeat(head2, c2);
    // node temp;
    // if (temp1.data < temp2.data) {
    // temp = new node(temp1.data);
    // c1++;
    // } else if (temp2.data < temp1.data) {
    // temp = new node(temp2.data);
    // c2++;
    // } else {
    // temp = new node(temp1.data);
    // c1++;
    // c2++;
    // }

    // if (head == null) {
    // head = temp;
    // tail = temp;
    // size++;
    // } else {
    // tail.next = temp;
    // tail = temp;
    // size++;
    // }
    // }
    // i++;
    // }

    // }
    // private static void merge() {
    // node temp1 = getnodeat(head1, c1);
    // node temp2 = getnodeat(head2, c2);
    // if (temp1.data < temp2.data) {
    // node t = new node(temp1.data);

    // }
    // }

    public static void main(String[] args) {
        long t = sc.nextInt();
        while (t > 0) {
            n1 = sc.nextLong();

            for (long i = 1; i <= n1; i++) {
                head1 = add(head1, sc.nextLong());
            }
            n2 = sc.nextLong();

            for (long i = 1; i <= n2; i++) {
                head2 = add(head2, sc.nextLong());
            }
            // System.out.println(getnodeat(head1, 0).data);
            // System.out.println("Linked List 1");
            // display(head1);
            // System.out.println("Linked List 2");
            // display(head2);
            head = merge(head1, head2);
            // System.out.println("Size=" + size);
            display(head);
            System.out.println();
            head = null;
            tail = null;
            head1 = null;
            head2 = null;
            size = 0;
            c1 = 0;
            c2 = 0;

            t--;
        }

    }
}