import java.util.*;

class nextGreater {
    static Stack<Integer> st = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        long[] a = new long[n];

        int i = 0;
        while (i < n) {
            a[i] = sc.nextLong();
            i++;
        }
        i = 0;
        while (i < n) {
            if (st.isEmpty() || a[st.peek()] >= a[i]) {
                st.push(i);
                i += 1;
            } else {
                int top = st.peek();
                while (a[top] <= a[i] && !st.isEmpty()) {
                    ans[top] = (int) a[i];
                    st.pop();
                }

            }
        }
        for (int x : ans) {
            System.out.println(x);
        }

    }
}