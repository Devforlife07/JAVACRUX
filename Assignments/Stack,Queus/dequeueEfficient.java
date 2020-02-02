import java.util.*;

class main {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if (s1.isEmpty()) {
                s1.push(i);
            } else {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                s1.push(i);
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }
        dequeue();
    }

    public static void dequeue() {
        while (!s1.isEmpty()) {
            // System.out.println("It Is Working");
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
