import java.util.*;

/**
 * nlengthk
 */
public class nlengthk {
    static Scanner sc = new Scanner(System.in);
    static char[] ans;
    static int k;

    public static void getans(int n, char[] ch) {
        if (n < 0) {
            System.out.println(Arrays.toString(ans));
            return;
        }
        for (int i = 0; i < k; i++) {
            ans[n] = ch[i];
            getans(n - 1, ch);
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        ans = new char[n];
        k = sc.nextInt();
        char[] ch = new char[k];
        int i = 0;
        while (i < k) {
            ch[i] = sc.next().charAt(0);
            i++;
        }
        getans(n - 1, ch);
    }
}