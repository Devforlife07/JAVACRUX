import java.util.*;

/**
 * circularArrayRotation
 */
public class circularArrayRotation {
    static Scanner sc = new Scanner(System.in);
    static int n, k, q;
    static int[] a;

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        q = sc.nextInt();
        a = new int[q];
        int[] no = new int[n];
        int t = 0;
        while (t < n) {
            no[t] = sc.nextInt();
            t++;
        }
        int i = 0;
        while (i < q) {
            a[i] = sc.nextInt();
            i++;
        }
      
        for (int j : a) {
            int ans = j - k;   
            if (ans < 0)
                ans += n;
            System.out.println(no[ans]);

        }
    }

}