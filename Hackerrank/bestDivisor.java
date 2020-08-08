import java.io.*;
import java.util.*;

public class bestDivisor {
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
        int n = sc.nextInt();
        ArrayList<Integer> fac = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                fac.add(i);
                if (n / i != i)
                    fac.add(n / i);
            }
        }
        int ans = 0;
        int s = Integer.MIN_VALUE;
        for (int x : fac) {
            if (sum(x) > s) {
                s = sum(x);
                ans = x;

            } else if (sum(x) == s) {
                if (x < ans) {
                    ans = x;
                }
            }

        }
        out.println(ans);
        out.flush();
    }

    public static int sum(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
}