import java.util.*;

/**
 * savePrisoner
 */
public class savePrisoner {
    static Scanner sc = new Scanner(System.in);
    static long n;
    static long m;
    static long s;
    static long t;

    public static void main(String[] args) {
        t = sc.nextLong();
        while (t > 0) {
            n = sc.nextLong();
            m = sc.nextLong();
            s = sc.nextLong();
            long ans = s + (m % n) - 1;
            if (ans > n) {
                ans = ans % n;
            }
            if (ans == 0)
                ans = n;
            System.out.println(ans);
            t--;
        }
    }
}