import java.util.*;

class bintree {
    class node {
        int data;
        node left;
        node right;

        node(int data, node left, node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private node root;
    private int size = 0;

    bintree() {
        Scanner sc = new Scanner(System.in);
        this.root = takeInput(sc, null, false);
    }

    private node takeInput(Scanner sc, node parent, boolean isleft) {
        if (parent == null) {
            System.out.println("Enter the data for root element");
        } else {
            if (isleft)
                System.out.println("Enter the data for left child of " + parent.data);
            else
                System.out.println("Enter the data for right child of " + parent.data);
        }
        int nodedata = sc.nextInt();
        node n = new node(nodedata, null, null);
        this.size++;
        boolean choice = false;
        System.out.println("Do You Have Left Child Of " + n.data);
        choice = sc.nextBoolean();
        if (choice) {
            n.left = takeInput(sc, n, true);
        }
        choice = false;
        System.out.println("Do You Have The Right Child of " + n.data);
        choice = sc.nextBoolean();
        if (choice) {
            n.right = takeInput(sc, n, false);
        }
        return n;
    }

    public void display() {
        this.display(this.root);
    }

    private void display(node root) {
        String str = "";
        if (root.left != null) {
            str = str + root.left.data + " => ";
        } else {
            str += " END";
        }
        str += root.data;
        if (root.right != null) {
            str = str + " =< " + root.right.data;
        } else {
            str += "END";
        }
        System.out.println(str);
        if (root.left != null)
            display(root.left);
        if (root.right != null)
            display(root.right);
    }

    public int height() {
        return this.height(this.root);
    }

    private int height(node root) {
        if (root == null)
            return -1;
        int left = height(root.left);
        int right = height(root.right);
        int height = Math.max(left, right) + 1;
        return height;
    }

    public void preorder() {
        this.preorder(this.root);
    }

    private void preorder(node root) {
        if (root == null)
            return;
        System.out.println(root.data + " ,");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder() {
        this.postorder(this.root);
    }

    private void postorder(node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public void inorder() {
        this.inorder(root);
        System.out.println("End");
    }

    private void inorder(node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void levelOrder() {
        System.out.println("Level Order Traversal");
        this.levelOrder(root);
        System.out.println("The End");
    }

    private void levelOrder(node root) {
        LinkedList<node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            node rv = queue.removeFirst();
            System.out.println(rv.data + " ");
            if (rv.left != null) {
                queue.addLast(rv.left);

            }
            if (rv.right != null)
                queue.addLast(rv.right);
        }
    }

    public int leafsum() {
        return this.leafsum(root);
    }

    private int leafsum(node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return root.data;
        }
        int lsum = leafsum(root.left);
        int rsum = leafsum(root.right);
        
        return lsum + rsum;
    }

    public int diameter(node root) {
        if (root == null)
            return 0;
        int case1 = height(root.left) + height(root.right) + 2;
        int case2 = this.diameter(root.left);
        int case3 = this.diameter(root.right);
        return Math.max(case1, Math.max(case2, case3));
    }

    public boolean isBST(node root) {
        return this.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(node root, int min, int max) {
        if (root == null)
            return true;
        if (root.data < min || root.data > max) {
            return false;
        } else if (!isBST(root.left, min, root.data))
            return false;
        else if (!isBST(root.right, root.data, max))
            return false;
        return true;
    }

    public static void main(String[] args) {
        bintree obj = new bintree();
        obj.display();
        System.out.println(obj.height());
        System.out.println("Preorder Traversal");
        obj.preorder();
        System.out.println("Postorder Traversal");
        obj.postorder();
        System.out.println("Inorder Traversal");
        obj.inorder();
        obj.levelOrder();
        System.out.println(obj.leafsum());
        

    }
}