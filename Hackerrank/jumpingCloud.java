import java.util.*;

/**
 * jumpingCloud
 */
public class jumpingCloud {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int k;
    static int[] a;

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        i = 0;
        int e = 100;
        while (true) {
            int curr = (i + k) % n;
            // System.out.println("ADDRESS=" + curr);
            // System.out.println("Current Value=" + a[curr]);
            if (a[curr] == 0)
                e -= 1;
            else
                e -= 3;
            System.out.println("E=" + e);
            i = (i + k) % n;
            if (i == 0)
                break;
        }
        // if (a[i] == 0)
        // e -= 1;
        // else
        // e -= 3;
        System.out.println(e);
    }
}