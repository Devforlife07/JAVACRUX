import java.util.*;

/**
 * pq
 */
class customcc implements Comparator<Integer> {
    int a;
    int b;

    public int compare(Integer a, Integer b) {
        return a < b ? 1 : -1;
    }
}

class pq {
    static PriorityQueue<Integer> q;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        q = new PriorityQueue<>(new customcc());
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            q.offer(sc.nextInt());
            i++;
        }
        System.out.println(q.poll());
    }
}