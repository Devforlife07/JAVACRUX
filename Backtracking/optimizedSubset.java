import java.net.URLConnection;
import java.util.*;

class optimizedsubsetSum {
    static Scanner sc = new Scanner(System.in);

    public static void subset(int[] a, int[] ans, int tsize, int n, int sum, int i, int m) {
        if (sum == m) {
            display(ans, tsize);
            // System.out.println("Tsize=" + tsize);

            return;
        } else {
            if (i < n)
                for (int j = i; j < n; j++) {
                    ans[tsize] = a[j];
                    if (sum + a[j] <= m)
                        subset(a, ans, tsize + 1, n, sum + a[j], j + 1, m);
                }

        }
    }

    }

    public static void getAns(int[] a, int m, int n) {
        int[] ans = new int[n];
        subset(a, ans, 0, n, 0, 0, m);

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        Arrays.sort(a);
        getAns(a, m, n);
    }

    public static void display(int[] ans, int index) {
        // System.out.println("Index" + index);
        for (int i = 0; i < index; i++)
            System.out.print(ans[i] + " ");
        System.out.println();
    }
}