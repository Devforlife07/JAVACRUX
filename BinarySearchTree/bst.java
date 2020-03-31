
/**
 * bst
 */
import java.util.*;

public class bst {
    static node root = null;

    class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public bst(int[] a, int lo, int hi) {
        root = add(a, lo, hi);
    }

    public node add(int[] a, int lo, int hi) {
        if (lo > hi)
            return null;
        int mid = (lo + hi) / 2;
        node n = new node(a[mid]);
        n.left = add(a, lo, mid - 1);
        n.right = add(a, mid + 1, hi);
        return n;
    }

    public int max(node root) {
        if (root == null)
            return -1;
        if (root.right != null)
            return max(root.right);
        return root.data;
    }

    public boolean find(node root, int data) {
        if (root == null)
            return false;
        if (root.data > data) {
            return find(root.right, data);
        } else if (root.data < data)
            return find(root.left, data);
        else
            return true;
    }

    public void display(node root) {
        if (root == null)
            return;
        String str = "";
        if (root.left != null)
            str += root.left.data;
        else
            str += ".";
        str += root.data;
        if (root.right != null)
            str += root.right.data;
        else
            str += ".";
        System.out.println(str);
        display(root.left);
        display(root.right);

    }

    public void add(node root, int data) {
        if (root.data > data) {
            if (root.right == null) {
                node n = new node(data);
                root.right = n;
            } else
                add(root.right, data);

        } else {
            if (root.left == null) {
                node n = new node(data);
                root.left = n;
            } else
                add(root.left, data);
        }
    }

    public void remove(node root, node parent, boolean isleft, int item) {
        if (root == null)
            return;
        if (root.data < item) {
            remove(root.left, root, true, item);
        } else if (root.data > item)
            remove(root.right, root, false, item);
        else {
            // if left and right subtree are null i.e node is the leaf node
            if (root.left == null && root.right == null) {
                if (isleft)
                    parent.left = null;
                else
                    parent.right = null;
            } else if (root.left == null && root.right != null) {
                if (isleft)
                    parent.left = root.right;
                else
                    parent.right = root.right; 
            } else if (root.left != null && root.right == null) {
                if (isleft)
                    parent.left = root.left;
                else
                    parent.right = root.left;
            } else {
                int max = max(root.left);
                root.data = max;
                remove(root.left, root, true, max);

            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        System.out.println("Enter the Element to be searched");
        int item = sc.nextInt();
        System.out.println("Enter the elements to be deleted");
        int item2 = sc.nextInt();
        bst obj = new bst(a, 0, a.length - 1);
        obj.display(root);
        System.out.println("Max= ");
        System.out.println(obj.max(root));
        System.out.println(obj.find(root, item));
        obj.remove(root, null, false, item2);
        obj.display(root);

    }
}