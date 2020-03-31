import java.util.*;

/**
 * sumoftwoarrays
 */
public class sumoftwoarrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        String str1 = Arrays.toString(a);
        String str2 = Arrays.toString(b);
        // System.out.println(Integer.parseInt(str1));
    }
}