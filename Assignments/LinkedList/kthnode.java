
/**
 * kthnode
 */
import java.util.*;

public class kthnode {
    static Scanner sc = new Scanner(System.in);

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static node head;

    public static node add() {
        int data = sc.nextInt();
        if (data == -1)
            return null;
        node n = new node(data);
        n.next = add();
        return n;

    }

    public static void main(String[] args) {
        head = add();

        int k = sc.nextInt();
        node slow = head;
        node fast = head;
        int i = 1;

        while (i <= k) {

            fast = fast.next;
            i++;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }
}