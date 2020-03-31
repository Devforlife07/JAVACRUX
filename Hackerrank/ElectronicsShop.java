import java.util.*;

/**
 * ElectronicsShop
 */
public class ElectronicsShop {
    static Scanner sc = new Scanner(System.in);
    static int b;
    static int n;
    static int m;
    static int[] k;
    static int[] mo;

    public static void main(String[] args) {
        b = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();
        k = new int[n];
        mo = new int[m];
        int i = 0;
        while (i < n) {
            k[i++] = sc.nextInt();
        }
        i = 0;
        while (i < m) {
            mo[i++] = sc.nextInt();
        }
        Arrays.sort(k);
        Arrays.sort(mo);
        int p1 = k.length - 1;
        int p2 = mo.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            int max = k[p1] + mo[p2];
            if (max < b) {
                System.out.println(max);
                return;
            } else {
                int t1 = k[p1];
                int t2 = mo[p2];
                if (t1 < t2)
                    p1--;
                else
                    p2--;
            }
        }
        System.out.println(-1);
    }

}