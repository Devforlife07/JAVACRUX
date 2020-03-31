import java.util.*;

/**
 * StringCompression
 */
public class StringCompression {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        String ans = "";
        int ri = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[ri]) {
                int diff = i - ri;
                if (diff != 1)
                    ans += a[ri] + String.valueOf(diff);
                else
                    ans += a[ri];
                ri = i;
            }
        }
        int diff = a.length - ri;

        if (diff != 1)
            ans += a[ri] + String.valueOf(diff);
        else
            ans += a[ri];

        System.out.println(ans);

    }
}