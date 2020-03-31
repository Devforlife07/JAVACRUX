import java.util.*;

/**
 * leftview2
 */
public class leftview2 {
    static Scanner sc = new Scanner(System.in);

    static class node {
        int data;
        int level;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static node root;

    public static node buildtree() {
        int data = sc.nextInt();
        if (data == -1)
            return null;
        node n = new node(data);
        Queue<node> q = new LinkedList<>();
        q.offer(n);
        while (!q.isEmpty()) {
            node rv = q.poll();
            int lc = sc.nextInt();
            if (lc != -1) {
                node left = new node(lc);
                rv.left = left;
                q.offer(left);
            }
            int rc = sc.nextInt();
            if (rc != -1) {
                node right = new node(rc);
                rv.right = right;
                q.offer(right);
            }
        }
        return n;
    }

    public static void leftview() {
        node temp = root;
        temp.level = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            node rv = q.poll();
            int ht = rv.level;
            if (!map.containsKey(ht)) {
                map.put(ht, rv.data);
            }
            if (rv.left != null) {
                q.add(rv.left);
                rv.left.level = ht + 1;
            }
            if (rv.right != null) {
                rv.left.level = ht + 1;
                q.add(rv.right);
            }
        }
        for (Map.Entry<Integer, Integer> ans : map.entrySet()) {
            System.out.println(ans);
        }

    }

    public static void main(String[] args) {
        root = buildtree();
        leftview();
    }

}