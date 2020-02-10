import java.util.*;

class generictree {
    private class node {
        int data;
        ArrayList<node> children;

        node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    private node root;
    private int size;

    generictree() {
        Scanner sc = new Scanner(System.in);
        this.root = takeInput(sc, null, 0);
    }

    private node takeInput(Scanner s, node parent, int ithchild) {
        if (this.root == null) {
            System.out.println("Enter The Data For The Root Node");
        } else {
            System.out.println("Enter The Data For The " + ithchild + " Child");

        }
        int nodedata = s.nextInt();
        node n = new node(nodedata);
        this.size++;
        System.out.println("Enter The Number Of Children for node with value " + n.data);
        int children = s.nextInt();
        for (int i = 0; i < children; i++) {
            node child = this.takeInput(s, n, i);
            n.children.add(child);
        }
        return n;
    }

    public static void main(String[] args) {
        generictree obj = new generictree();

    }
}