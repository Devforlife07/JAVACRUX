import java.util.*;

/**
 * verticalOrder
 */
public class verticalOrder {
    static Scanner sc = new Scanner(System.in);

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

    public static node root;

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

    public static void printverticalOrder() {
        if (root == null)
            return;
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        int hd = 0;
        getverticalOrder(root, hd, map);
        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
            System.out.println(e);
        }
    }

    public static void getverticalOrder(node root, int hd, TreeMap<Integer, ArrayList<Integer>> map) {
        if (root == null)
            return;
        if (map.get(hd) == null) {
            ArrayList<Integer> l = new ArrayList<>();
            l.add(root.data);
            map.put(hd, l);
        } else {
            ArrayList<Integer> l = map.get(hd);
            l.add(root.data);
            map.put(hd, l);
        }
        getverticalOrder(root.left, hd - 1, map);
        getverticalOrder(root.right, hd + 1, map);

    }

    public static void main(String[] args) {
        root = buildtree();
        printverticalOrder();
    }
}