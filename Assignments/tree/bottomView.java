import java.util.*;

/**
 * bottomView
 */
public class bottomView {
    static Scanner sc = new Scanner(System.in);

    static class node {
        int data;
        int height;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    private static node root = null;

    public static node buildtree() {
        int data = sc.nextInt();
        if (data == -1)
            return null;
        node rootnode = new node(data);
        Queue<node> q = new LinkedList<>();
        q.offer(rootnode);
        while (!q.isEmpty()) {
            node rv = q.poll();
            int lc = sc.nextInt();
            if (lc != -1) {
                rv.left = new node(lc);
                q.add(rv.left);
            }
            int rc = sc.nextInt();
            if (rc != -1) {
                rv.right = new node(rc);
                q.add(rv.right);
            }

        }

        return rootnode;

    }

    public static void bottomView(node root) {
        if (root == null)
            return;
        TreeMap<Integer, Integer> t = new TreeMap<>();
        Queue<node> q = new LinkedList<>();
        root.height = 0;
        q.add(root);
        while (!q.isEmpty()) {
            node temp = q.remove();
            int hd = temp.height;
            t.put(hd, temp.data);
            if (temp.left != null) {
                temp.left.height = hd - 1;
                q.add(temp.left);
            }

            if (temp.right != null) {
                temp.right.height = hd + 1;
                q.add(temp.right);
            }

        }
        for (Map.Entry<Integer, Integer> e : t.entrySet()) {
            System.out.print(e.getValue() + " ");
        }

    }

    // public static void getTop(node root, int hd, TreeMap<Integer, Integer> t) {

    // if (root == null)
    // return;

    // t.put(hd, root.data);

    // getTop(root.left, hd - 1, t);
    // getTop(root.right, hd + 1, t);
    // }

    public static void main(String[] args) {
        root = buildtree();
        bottomView(root);

        // getTop(root, hd, t);

    }
}