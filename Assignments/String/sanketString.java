import java.util.*;

/**
 * sanketString
 */
public class sanketString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt();
        String str = sc.next();
        char[] a = str.toCharArray();
        int max = 0;
        int len = 1;
        char cc = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == cc) {
                len++;
            } else {
                int count = length(a, i, a[i]);
                // System.out.println("COUNT=" + count);
                if (count <= k) {
                    len += count;
                    max = len;
                    i += count - 1;
                } else {
                    len = 0;
                    cc = a[i];
                    // System.out.println(cc);
                }
            }

        }
        // if (len > max)
        // max = len;
        System.out.println(max);

    }

    public static int length(char[] a, int i, char cc) {
        int j = i;
        // System.out.println(cc);
        while (j < a.length) {
            if (a[j] != cc) {
                return j - i;
            }
            j++;
        }
        return a.length - i;
    }
}