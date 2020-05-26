import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = 4;
        int w = 7;
        int val[] = { 20, 30, 10, 50 };
        int wt[] = { 2, 1, 6, 1 };
        int[][] dp = new int[n][w];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w; j++) {
                dp[i][j] = -1;
            }
        }
        // for (int i = 0; i < n; i++)
        // dp[i][0] = 100 * 0;
        // for (int j = 0; j <w; j++)
        // dp[0][j] = 100 * 0;
        int ans = getResult(val, wt, 0, w, dp);
        System.out.println(ans);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w; j++)
                System.out.print(dp[i][j] + " ");
            System.out.println();
        }
    }

    public static int getResult(int[] val, int wt[], int n, int w, int[][] dp) {
        int result = 0;
        if (n > 0 && w > 0) {
            if (dp[n - 1][w - 1] != -1)
                return dp[n - 1][w - 1];

            if (n == 0 || w == 0)
                result = 0;
            else if (wt[n - 1] > w && n < val.length) {
                result = getResult(val, wt, n - 1, w, dp);
            } else {
                if (n < val.length) {
                    int r1 = val[n - 1] + getResult(val, wt, n + 1, w - wt[n - 1], dp);
                    int r2 = getResult(val, wt, n + 1, w - wt[n - 1], dp);
                    result = Math.max(r1, r2);
                }
            }
            dp[n - 1][w - 1] = result;
            return result;
        } else
            return 0;
    }
}