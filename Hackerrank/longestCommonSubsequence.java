import java.io.*;
import java.util.*;

class longestCommonSubsequence {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        int[] x = new int[n];
        int[] y = new int[m];
        StringBuilder s1 = new StringBuilder();
        while (i < n) {
            x[i] = sc.nextInt();
            i++;
        }
        i = 0;
        StringBuilder s2 = new StringBuilder();
        while (i < m) {
            y[i] = sc.nextInt();
            i++;

        }

        int[] ans = getResult(n, m, x, y);
        for (i = 1; i < ans.length; i++) {
            out.print(ans[i] + " ");
        }
        out.flush();

    }

    public static int[] getResult(int n, int m, int[] s1, int[] s2) {
        int[][] dp = new int[n + 1][m + 1];
        // List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            dp[i][0] = 0;
        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1[i - 1] == s2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int val = dp[n][m];
        int[] ans = new int[val + 1];
        int i = n;
        int j = m;
        while (i > 0 & j > 0) {
            if (s1[i - 1] == s2[j - 1]) {
                ans[val] = s1[i - 1];
                val--;
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }

            }
        }

        out.flush();

        return ans;
    }

}
