import java.util.*;

class sumlevel {
    static Scanner sc = new Scanner(System.in);

    static class node {
        int data;
        ArrayList<node> children;

        node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    private static node root;

    sumlevel() {
    }

    public static node buildtree() {
        int data = sc.nextInt();
        node n = new node(data);
        int children = sc.nextInt();
        for (int i = 1; i <= children; i++) {
            node t = buildtree();
            n.children.add(t);
        }
        return n;
    }

    public static void display() {
        LinkedList<node> q = new LinkedList<>();
        q.addLast(root);
        {
            while (true) {
                node n = q.removeFirst();
                System.out.println(n.data);
                if (n.children.size() != 0) {
                    int i = 0;
                    while (i < n.children.size()) {
                        q.addLast(n.children.get(i));
                        i++;
                    }
                }
                if (q.isEmpty()) {
                    break;
                }
            }
        }
    }

    public static int sum(node root, int k) {
        int sum = 0;
        LinkedList<node> q = new LinkedList<>();
        q.add(root);
        q.addLast(null);
        int i = 0;
        while (i <= k) {
            if (i == k) {
                // q.removeFirst();
                node temp = q.removeFirst();
                while (temp != null) {
                    // System.out.println();
                    // System.out.println("last values=" + q.removeFirst().data);
                    sum += temp.data;
                    // System.out.println("Data=" + temp.data);

                    temp = q.removeFirst();

                }
                return sum;
            } else {
                while (q.peek() != null) {
                    // System.out.println("Nodes Visited=" + q.peek().data);
                    node n = q.removeFirst();
                    int j = 0;
                    while (j < n.children.size()) {
                        q.addLast(n.children.get(j));
                        j++;
                    }
                    // i++;
                    // q.addLast(null);
                    // node bin = q.removeFirst();
                }
                i++;
                q.addLast(null);
                node bin = q.removeFirst();

            }
        }
        return sum;
    }
    // public static int sum(node root, int k) {
    // if (k == 0)
    // return root.data;
    // if (root == null)
    // return 0;
    // int lsum = sum(root.children.get(0), k - 1);
    // int rsum = sum(root.children.get(1), k - 1);
    // return lsum + rsum;

    // }
    // public static int sum(int k) {
    // int i = 1;
    // LinkedList<node> q = new LinkedList<>();
    // q.add(root);
    // while (i <= k) {
    // if (q.isEmpty()) {
    // return 0;
    // }
    // node cn = q.removeFirst();
    // if (cn.children.size() != 0) {
    // int j = 0;
    // while (j < cn.children.size()) {
    // q.addLast(cn.children.get(j));
    // j++;
    // }
    // // i++;

    // }
    // i++;

    // }
    // int sum = 0;
    // System.out.println();
    // while (!q.isEmpty()) {

    // node temp = q.removeFirst();
    // System.out.print(temp.data + " ");
    // sum += temp.data;

    // }
    // return sum;
    // }

    public static void main(String[] args) {
        root = buildtree();
        // display();
        int k = sc.nextInt();
        if (k == 0)
            System.out.println(root.data);
        else
            System.out.println(sum(root, k));

    }
}