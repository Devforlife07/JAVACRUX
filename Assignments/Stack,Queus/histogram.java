import java.util.*;

class histogram {
    static Stack<Integer> st = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long[] a = new long[n];
        for (long i = 0; i < n; i++)
            a[i] = sc.nextInt();
        long ans = cal(a);
        System.out.println(ans);
    }

    public static long cal(long[] a) {
        long maxArea = 0;
        long i = 0;
        while (i < a.length) {
            if (st.isEmpty() || a[st.peek()] <= a[i]) {
                st.push(i++);
            } else {
                long top = st.peek();
                st.pop();
                long area = st.isEmpty() ? a[top] * i : a[top] * (i - st.peek() - 1);
                if (area > maxArea)
                    maxArea = area;

            }
        }
        while (!st.isEmpty()) {
            long top = st.peek();
            st.pop();
            long area = st.isEmpty() ? a[top] * i : (a[top] * (i - st.peek() - 1));
            if (area > maxArea)
                maxArea = area;
        }

        return maxArea;
    }

}