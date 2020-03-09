import java.util.*;

/**
 * postintree
 */
public class postintree {
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

    private static node root;

    public static node buildtree(int[] in, int[] po, int si, int ei, int pi) {
        if (si > ei)
            return null;
        if (pi < 0) {
            return null;
        }
        // System.out.println("pi=" + pi);
        int key = po[pi];
        pi = pi - 1;
        int cur = -1;
        int i = si;
        // System.out.println("si=" + si);
        while (i <= ei) {
            if (key == in[i]) {
                cur = in[i];
                break;

            } else
                i++;
        }
        // System.out.println("i=" + i);
        // System.out.println("key=" + key);
        // System.out.println("Current=" + cur);
        node n = null;
        if (cur != -1) {
            n = new node(cur);
            if (si == ei)
                return n;
            if (pi >= 0) {
                // System.out.println("Right Call");
                n.right = buildtree(in, po, i + 1, ei, pi);
            }
            if (pi >= 0) {
                // System.out.println("Left Call");
                n.left = buildtree(in, po, si, i - 1, pi - 1);
            }
        }
        return n;
    }

    public static void display(node root) {
        if (root == null)
            return;

        System.out.println(root.data);

        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int po[] = new int[n];
        for (int i = 0; i < n; i++)
            po[i] = sc.nextInt();
        int m = sc.nextInt();
        int in[] = new int[m];
        for (int i = 0; i < m; i++) {
            in[i] = sc.nextInt();
        }
        root = buildtree(in, po, 0, in.length - 1, po.length - 1);
        // System.out.println("********");

        display(root);
    }
}