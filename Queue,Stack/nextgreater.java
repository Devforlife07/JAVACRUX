import java.util.*;

class nextGreater {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[i] > stack.peek()) {
                int top = stack.pop();
                System.out.println(top + "->" + a[i]);
            }
            stack.push(a[i]);

        }
        while (!stack.isEmpty())

        {
            System.out.println(stack.pop() + "->" + "-1");
        }
        sc.close();
    }
}