import java.util.*;

/**
 * structurallyidentical
 */
public class structurallyidentical {
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

    public static boolean equivalent(node root1, node root2) {

        if (root1 == null && root2 == null)
            return true;
        else if (root1 == null && root2 != null)
            return false;
        else if (root1 != null && root2 == null)
            return false;
        else {
            if (root1.data == root2.data && equivalent(root1.left, root2.left) && equivalent(root1.right, root2.right))
                return true;
            else
                return false;
        }
    }

    public static void display(node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }

    public static node build() {
        int data = sc.nextInt();
        node n = new node(data);
        boolean choice1 = sc.nextBoolean();
        if (choice1)
            n.left = build();
        boolean choice2 = sc.nextBoolean();
        if (choice2)
            n.right = build();
        return n;
    }

    public static node root1 = null;
    public static node root2 = null;

    public static void main(String[] args) {
        root1 = build();
        // display(root1);
        root2 = build();
        // display(root2);
        System.out.println(equivalent(root1, root2));

    }
}