import java.util.LinkedList;

/**
 * try
 */
public class trys {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static LinkedList<Integer> ll = new LinkedList<>();

    public static void main(String[] args) {
        ll.add(5);
        System.out.println(ll.get(0));
    }
}