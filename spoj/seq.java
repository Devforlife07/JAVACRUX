import java.util.*;
import java.io.*;

class seq {
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
        int t = sc.nextInt();
        while (t > 0) {
            int k = sc.nextInt();
            int[] b = new int[k];
            int i = 0;
            while (i < k) {
                b[i] = sc.nextInt();
                i++;
            }
            int[] c = new int[k];
            i = 0;
            while (i < k) {
                c[i] = sc.nextInt();
                i++;
            }
            int n = sc.nextInt();
            if (n <= k) {
                System.out.println(b[n - 1]);
            } else {
                int[] dp = new int[n + 1];
                i = 1;
                while (i <= k) {
                    dp[i] = (b[i - 1] % 1000000000);
                    i++;
                }
                for (; i <= n; i++) {
                    long sum = 0;
                    for (int j = 1; j <= k; j++) {
                        sum += ((long) (c[j - 1] * dp[i - j]));
                    }
                    sum %= 1000000000;
                    dp[i] = (int) sum;
                }
                System.out.println(dp[n]);

            }

            t--;
        }
    }

}