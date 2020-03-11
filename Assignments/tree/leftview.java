// Given a binary tree , print its nodes from root to bottom as visible from left side of tree

// Input Format
// Level order input for the binary tree will be given.

// Constraints
// No of nodes in the tree can be less than or equal to 10^7

// Output Format
// A single line containing space separated integers representing the left view of the tree

// Sample Input
// 1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1
// Sample Output
// 1 2 4
// Explanation
// The tree looks like

//              1
//           /      \
//        2           3
//     /     \           \
//    4       5           6
// When viewed from the left , we would see the nodes 1,2 and 4.

import java.util.*;

class leftview {
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

    private static node buildtree() {
        int data = sc.nextInt();
        node rootnode = new node(data);
        if (data == -1)
            return null;
        LinkedList<node> que = new LinkedList<>();
        que.addLast(rootnode);
        while (!que.isEmpty()) {
            node rv = que.removeFirst();
            int lc = sc.nextInt();
            if (lc != -1) {
                node left = new node(lc);
                rv.left = left;
                que.add(left);
            }
            int rc = sc.nextInt();
            if (rc != -1) {
                node right = new node(rc);
                rv.right = right;
                que.add(right);
            }
        }

        return rootnode;
    }

    private static List<Integer> ans() {
        List<Integer> l = new ArrayList<>();
        Queue<node> q = new LinkedList<>();
        if (root == null)
            return l;
        q.add(root);
        while (!q.isEmpty()) {
            int i = 0;
            int size = q.size();
            while (i < size) {
                node rv = q.remove();
                if (i == 0)
                    l.add(rv.data);
                if (rv.left != null)
                    q.add(rv.left);
                if (rv.right != null)
                    q.add(rv.right);
                i++;
            }
        }
        return l;
    }

    public static void preorder(node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = buildtree();
        // preorder(root);
        List<Integer> get = ans();
        for (int i : get)
            System.out.print(i + " ");
    }
}