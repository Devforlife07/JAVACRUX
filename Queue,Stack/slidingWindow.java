import java.util.*;

class slidingWindow {
    static Scanner sc = new Scanner(System.in);

    public static void getResult(int a[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int i = 0;
        for (; i < k; i++) {
            while (!dq.isEmpty() && a[i] > a[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.add(i);
        }
        for (; i < n; i++) {
            System.out.println(a[dq.peek()]);
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && a[i] > a[dq.peekLast()])
                dq.removeLast();
            dq.add(i);
        }
        System.out.println(a[dq.peek()]);

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        int i = 0;
        while (i < n) {
            a[i++] = sc.nextInt();
        }
        int k = sc.nextInt();
        getResult(a, n, k);

    }

}