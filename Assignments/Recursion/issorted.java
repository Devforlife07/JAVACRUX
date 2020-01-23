import java.util.*;

class issorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean ans = issorted(a, 1);
        System.out.println(ans);

    }

    public static boolean issorted(int[] a, int i) {
        if (i == a.length)
            return true;
        if (a[i] < a[i - 1])
            return false;
        boolean ans = issorted(a, i + 1);
        return ans;
    }
}