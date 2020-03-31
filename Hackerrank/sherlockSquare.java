import java.util.*;

/**
 * sherlockSquare
 */
public class sherlockSquare {

    static Scanner sc = new Scanner(System.in);
    static int q;
    static long m;
    static long n;

    public static boolean issq(long num) {
        long ans = (long) Math.floor(Math.sqrt(num));

        if (ans - Math.sqrt(num) == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        q = sc.nextInt();
        while (q > 0) {
            m = sc.nextLong();
            n = sc.nextLong();
            long sq = (long) Math.ceil(Math.sqrt(m));
            int count = 0;
            while (sq * sq <= n) {
                count++;
                sq++;
            }
            System.out.println(count);
            q--;
        }

    }
}