import java.util.*;

class knapSackBottomUp {
    static Scanner sc = new Scanner(System.in);

    public static void getResult(int[] val, int[] wt, int n, int w) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++)
                dp[i][j] = -1;

        }
        for (int i = 0; i < n + 1; i++)
            dp[i][0] = 0;
        for (int i = 0; i < w + 1; i++)
            dp[0][i] = 0;
        for (int items = 1; items < n + 1; items++) {
            for (int j = 1; j < w + 1; j++) {
                int maxWithoutCurr = dp[items - 1][j];
                int maxWithCurr = 0;
                int currCapacity = wt[items - 1];
                if (j >= currCapacity) {
                    maxWithCurr = val[items - 1];

                    int leftCapacity = j - currCapacity;
                    maxWithCurr += dp[items - 1][leftCapacity];
                }
                dp[items][j] = Math.max(maxWithCurr, maxWithoutCurr);

            }

        }
        System.out.println(dp[n][w]);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int w = sc.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        int i = 0;
        while (i < n) {
            val[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < n) {
            wt[i] = sc.nextInt();
            i++;
        }
        getResult(val, wt, n, w);
    }
}