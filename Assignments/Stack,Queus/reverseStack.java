import java.util.*;

class demo {
    static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            st.push(sc.nextInt());
        reverse();
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }

    public static void reverse() {
        if (st.isEmpty())
            return;
        int item = st.pop();
        reverse();
        insertbottom(item);

    }

    public static void insertbottom(int n) {
        if (st.isEmpty()) {
            st.push(n);
        } else {
            int item = st.peek();
            st.pop();
            insertbottom(n);
            st.push(item);
        }

    }
}