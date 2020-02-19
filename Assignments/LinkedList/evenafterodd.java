import java.util.*;

class evenafterodd {

    static int size2 = 0;

    static Scanner sc = new Scanner(System.in);

    public static boolean isEmpty() {
        return (size2 == 0) ? true : false;
    }

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // static LinkedList<node> ll = new LinkedList<>();
    static ArrayList<node> q = new ArrayList<>();

    private static node head = null;
    private static node tail = null;
    private static int size = 0;

    private static void add(int data) {
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

    private static void display() {
        node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static int counter = 0;

    public static node cal(node head) {

        if (head == null)
            return null;
        int data = head.data;

        if (data % 2 != 0) {
            head.next = cal(head.next);
            return head;
        } else {
            q.add(counter++, head);
            return cal(head.next);
        }

    }

    public static void main(final String[] args) {
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(sc.nextInt());
            return;
        }
        int i = 1;
        while (i <= n) {
            add(sc.nextInt());
            i++;
        }

        head = cal(head);
        node tail = null;
        node prev = null;
        node temp = head;
        while (temp != null) {
            tail = temp;
            temp = temp.next;
        }

        if (counter != 0) {
            node a = q.get(counter - 1);
            a.next = null;
        }
        if (head == null) {
            head = q.get(0);
            tail = q.get(0);
        }
        for (i = 0; i < q.size(); i++) {
            node t = q.get(i);

            tail.next = t;
            tail = t;

        }

        display();

    }
}
