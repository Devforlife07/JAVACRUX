import java.util.*;

/**
 * postint2
 */
public class postint2 {
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

    private static node buildtree(int[] in, int[] po, int si, int ei) {
        if (si > ei)
            return null;
        int curr = po[pi];
        pi = pi - 1;
        node n = new node(curr);
        int i = si;
        while (i <= ei) {
            if (curr == in[i]) {
                break;
            }
            i++;
        }
        if (si == ei)
            return n;
        n.right = buildtree(in, po, i + 1, ei);
        n.left = buildtree(in, po, si, i - 1);
        return n;
    }

    public static void display(node root) {

        String str = "";
        if (root.left != null)
            str += root.left.data + " => ";
        else {
            str += "END => ";
        }
        str += root.data;
        if (root.right != null)
            str += " <= " + root.right.data;
        else
            str += " <= END";
        System.out.println(str);
        if (root.left != null)
            display(root.left);
        if (root.right != null)
            display(root.right);
    }

    static int pi;

    public static void main(String[] args) {
        int m = sc.nextInt();
        int[] po = new int[m];
        int i = 0;
        while (i < m) {
            po[i] = sc.nextInt();
            i++;
        }
        int n = sc.nextInt();
        int[] in = new int[n];
        i = 0;
        while (i < n) {
            in[i] = sc.nextInt();
            i++;
        }
        pi = po.length - 1;
        root = buildtree(in, po, 0, in.length - 1);
        display(root);
    }

}