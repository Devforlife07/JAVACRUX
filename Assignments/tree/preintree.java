import java.util.*;

class preint {
    static Scanner sc = new Scanner(System.in);

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private static node root;
    static int pi;

    private static node buildtree(int[] pre, int[] in, int si, int ei) {
        if (si > ei)
            return null;
        int i = 0;
        int curr = pre[pi];
        while (i <= ei) {
            if (in[i] == curr)
                break;
            else
                i++;
        }
        pi++;
        node n = new node(curr);
        if (si == ei)
            return n;
        n.left = buildtree(pre, in, 0, i - 1);
        n.right = buildtree(pre, in, i + 1, ei);

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

    public static void main(String[] args) {
        int m = sc.nextInt();
        int[] pre = new int[m];
        int i = 0;
        while (i < m) {
            pre[i] = sc.nextInt();
            i++;
        }
        int n = sc.nextInt();
        int[] in = new int[n];
        i = 0;
        while (i < n) {
            in[i] = sc.nextInt();
            i++;
        }
        pi = 0;
        root = buildtree(pre, in, 0, in.length - 1);
        display(root);
    }
}
