import java.util.*;

/**
 * findDigit
 */
public class findDigit {
    static Scanner sc = new Scanner(System.in);
    static int t;
    static long n;

    public static void main(String[] args) {
        t = sc.nextInt();
        while (t > 0) {
            n = sc.nextLong();
            int count = 0;
            long temp = n;
            while (temp != 0) {
                long rem = temp % 10;
                if (rem != 0) {
                    if (n % rem == 0)
                        count++;
                }
                temp /= 10;
            }
            t--;
            System.out.println(count);
        }

    }
}