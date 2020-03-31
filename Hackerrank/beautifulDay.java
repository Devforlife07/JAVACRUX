import java.util.*;

/**
 * beautifulDay
 */
public class beautifulDay {
    static Scanner sc = new Scanner(System.in);
    static long si;
    static long ei;
    static long k;

    public static void main(String[] args) {
        si = sc.nextLong();
        ei = sc.nextLong();
        k = sc.nextLong();
        long count = 0;
        for (long i = si; i <= ei; i++) {
            long rev = Long.valueOf((new StringBuilder(String.valueOf(i))).reverse().toString());
            boolean res = (i - rev) % k == 0 ? true : false;
            if (res)
                count++;
        }
        System.out.println(count);
    }
}