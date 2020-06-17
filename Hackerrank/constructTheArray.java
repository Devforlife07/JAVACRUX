import java.io.*;
import java.util.*;

public class constructTheArray {
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

    static int MOD = 1000000007;

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        long res = 1;
        int flag = 0;
        if (k == 2 && n >= 3) {
            System.out.println(0);
        } else {
            for (int i = 2; i < n - 1; i++) {
                res = (res * (k - 1)) % MOD;

            }
            if (x != 1) {
                res = ((res * (k - 2) % MOD) % MOD);
            } else {
                res = (res * (k - 2) % MOD) % MOD;
                res += 1;
            }
            out.println(res);
            out.flush();

        }
    }
}