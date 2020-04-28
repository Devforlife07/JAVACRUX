import java.util.*;

public class queensattack {
    static Scanner sc = new Scanner(System.in);

    public static int getMoves(int rq, int cq, int[] r, int[] c, int n) {
        int d11, d12, d21, d22, l1, l2, u1, u2;
        d11 = Math.min(rq - 1, cq - 1);
        d12 = Math.min(n - rq, n - cq);
        d21 = Math.min(n - rq, cq - 1);
        d22 = Math.min(rq - 1, n - cq);
        l1 = rq - 1;
        l2 = n - rq;
        u1 = cq - 1;
        u2 = n - cq;
        for (int i = 0; i < r.length; i++) {
            int x = r[i];
            int y = c[i];
            if (x < rq && y < cq && rq - x == cq - y) {
                d11 = Math.min(d11, rq - x - 1);
            }
            if (x > rq && y > cq && x - rq == y - cq) {
                d12 = Math.min(d12, x - rq - 1);
            }
            if (x < rq && y > cq && rq - x == y - cq) {
                d21 = Math.min(d21, y - cq - 1);
            }
            if (x > rq && y < cq && x - rq == cq - y) {
                d22 = Math.min(d22, x - rq - 1);
            }
            if (cq == y && rq > x) {
                u1 = Math.min(1, rq - x - 1);
            }
            if (cq == y && rq < x) {
                u2 = Math.min(u2, x - rq - 1);
            }
            if (rq == x && cq > y) {
                l1 = Math.min(l1, cq - y - 1);
            }
            if (rq == x && y > cq) {
                l2 = Math.min(l2, y - cq - 1);
            }
        }
        return d11 + d12 + d21 + d22 + l1 + l2 + u1 + u2;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rq = sc.nextInt();
        int cq = sc.nextInt();
        int r[] = new int[k];
        int c[] = new int[k];
        int i = 0;
        while (i < k) {
            r[i] = sc.nextInt();
            c[i] = sc.nextInt();
            i++;
        }
        int res = getMoves(rq, cq, r, c, n);
        System.out.println(res);
    }
}