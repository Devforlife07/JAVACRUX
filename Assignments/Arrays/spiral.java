import java.util.*;
import java.util.Arrays;

/**
 * spiral
 */
public class spiral {
    static Scanner sc = new Scanner(System.in);

    public static void cal(int[][] a, int m, int n) {
        int k = 0;
        int l = 0;
        int i = 0;
        while (k < m && l < n) {
            for (i = l; i < n; i++) {
                System.out.print(a[k][i] + ", ");
            }
            k++;
            for (i = k; i < m; i++) {
                System.out.print(a[i][n - 1] + ", ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; i--) {
                    System.out.print(a[m - 1][i] + ", ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + ", ");
                }
                l++;
            }
        }
        System.out.println("END");

    }

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }
        cal(a, m, n);
    }
}