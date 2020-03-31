import java.util.*;

/**
 * sumatlevelK
 */
class sumatlevelK {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Scanner sc = new Scanner(System.in);
    private static node root = null;

    private static node buildtree() {
        int data = sc.nextInt();
        node n = new node(data);
        boolean choice1 = sc.nextBoolean();
        if (choice1) {
            n.left = buildtree();
        }
        boolean choice2 = sc.nextBoolean();
        if (choice2)
            n.right = buildtree();
        return n;
    }

    public static void display(node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }

    public static void getans(int k) {
        int level = 0;
        int sum = 0;
        Queue<node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            level++;
            if (level == k) {
                // System.out.println("SIZE=" + q.size());
                // System.out.println("Top=" + q.peek().data);
                while (q.peek() != null) {
                    sum += q.remove().data;
                }
                System.out.println("SUM=" + sum);
                return;
            } else {
                node temp = q.remove();
                // System.out.println("REMOVED DATA=" + temp.data);
                while (temp != null) {
                    System.out.println("Curr" + temp.data);
                    if (temp.left != null)
                        q.add(temp.left);
                    if (temp.right != null)
                        q.add(temp.right);
                    temp = q.remove();
                    // System.out.println("REMOVED DATA=" + temp);

                }
                q.add(null);
                // q.remove();
            }

        }

    }

    public static void main(String[] args) {
        int k = sc.nextInt();
        root = buildtree();
        display(root);
        getans(k);
    }
}
/*
 * 2 1 true 2 false false true 3 false false
 */