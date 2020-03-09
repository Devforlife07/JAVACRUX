import java.util.*;

class isbalanced {
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

    static node root;

    public static node add() {
        int data = sc.nextInt();
        node n = new node(data);
        boolean choice1 = sc.nextBoolean();
        if (choice1 == true)
            n.left = add();
        boolean choice2 = sc.nextBoolean();

        if (choice2 == true)
            n.right = add();
        return n;
    }

    public static void display(node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);

    }

    public static boolean isbalanced(node root) {
        int ldepth = depth(root.left);
        int rdepth = depth(root.right);
        // System.out.println("Left=" + ldepth);
        // System.out.println("Right=" + rdepth);
        int depthval = (int) Math.abs(ldepth - rdepth);
        if (depthval > 1)
            return false;
        else
            return true;
    }

    public static int depth(node root) {
        int ldepth = 0, rdepth = 0;
        if (root == null)
            return -1;
        if (root.left != null) {
            ldepth = depth(root.left);
        }
        if (root.right != null) {
            rdepth = depth(root.right);
        }
        return (int) Math.max(ldepth, rdepth) + 1;
    }

    public static void main(String[] args) {
        root = add();
        display(root);
        // System.out.println(depth(root));
        System.out.println(isbalanced(root));
    }
}