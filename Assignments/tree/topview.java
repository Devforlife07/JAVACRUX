import java.util.*;

/**
 * topview
 */

// Given a binary tree , print the nodes in left to right manner as visible from
// above the tree

// Input Format
// Level order input for the binary tree will be given.

// Constraints
// No of nodes in the tree can be less than or equal to 10^7

// Output Format
// A single line containing space separated integers representing the top view
// of the tree

// Sample Input
// 1 2 3 4 5 6 -1 -1 -1 -1 -1 -1 -1
// Sample Output
// 4 2 1 3
// Explanation
// The tree looks like

// 1
// / \
// 2 3
// / \ /
// 4 5 6
// When viewed from the top , we would see the nodes 4, 2, 1 and 3.
public class topview {
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

    public static void getTop(node root, int hd, TreeMap<Integer, Integer> t) {
        if (root == null)
            return;
        if (!t.containsKey(hd)) {
            t.put(hd, root.data);
        }
        getTop(root.left, hd - 1, t);
        getTop(root.right, hd + 1, t);

    }

    public static node buildtree() {
        int data = sc.nextInt();
        if (data == -1)
            return null;
        node rootnode = new node(data);
        Queue<node> q = new LinkedList<>();
        q.add(rootnode);
        while (!q.isEmpty()) {
            node rv = q.remove();
            int lc = sc.nextInt();
            if (lc != -1) {
                rv.left = new node(lc);
                q.add(rv.left);
            }
            int rc = sc.nextInt();
            if (rc != -1) {
                rv.right = new node(rc);
                q.offer(rv.right);
            }
        }
        return rootnode;
    }

    public static void main(String[] args) {
        root = buildtree();
        TreeMap<Integer, Integer> t = new TreeMap<>();
        int hd = 0;
        getTop(root, hd, t);
        for (Map.Entry<Integer, Integer> e : t.entrySet()) {
            System.out.print(e.getValue() + " ");
        }
    }
}
