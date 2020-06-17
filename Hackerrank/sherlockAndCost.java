import java.io.*;
import java.util.*;

public class sherlockAndCost {
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int i = 0;
            while (i < n) {
                a[i] = sc.nextInt();
                i++;
            }
            int[][] dp = new int[n][2];
            dp[0][0] = 0;
            dp[0][1] = a[0];
            for (i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + Math.abs(a[i - 1] - 1));
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + Math.abs(a[i] - 1));
            }
            out.println(Math.max(dp[i - 1][0], dp[i - 1][1]));
            out.flush();

        }
    }
}