
/**
 * intersectingpt
 */
import java.util.*;

// import sun.awt.www.content.audio.wav;

class intersectingpt {
    static Scanner sc = new Scanner(System.in);

    private static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static int size1 = 0;
    private static int size2 = 0;
    private static node head1 = null;
    private static node tail1 = null;
    private static node head2 = null;
    private static node tail2 = null;

    public static void add(int data) {
        node n = new node(data);
        if (head1 == null) {
            head1 = n;
            tail1 = n;
            size1++;
            return;
        }
        tail1.next = n;
        tail1 = n;
        size1++;
    }

    public static void add2(int data) {
        node n = new node(data);
        if (head2 == null) {
            head2 = n;
            tail2 = n;
            size2++;
            return;
        }
        tail2.next = n;
        tail2 = n;
        size2++;
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static node cal() {
        if (size1 > size2) {
            return getans(head1, head2, size1 - size2);
        } else {
            return getans(head2, head1, size2 - size1);
        }

    }

    public static node getans(node head1, node head2, int d) {
        node current1 = head1;
        node current2 = head2;
        for (int i = 0; i < d; i++) {
            current1 = current1.next;
        }
        while (current1 != null & current2 != null) {
            if (current1.data == current2.data)
                return current1;
            current1 = current1.next;
            current2 = current2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            add2(sc.nextInt());
        }
        if (size1 != size2) {
            node ans = cal();

            if (ans != null)
                System.out.println(ans.data);
            else
                System.out.println(-1);
        } else
            System.out.println(head1.data);
    }

}