import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class fibonacciModified {
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
        // int t = sc.nextInt();

        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int n = sc.nextInt();
        // System.out.println(t2);
        BigInteger[] a = new BigInteger[21];
        a[1] = BigInteger.valueOf(t1);
        a[2] = BigInteger.valueOf(t2);
        for (int i = 3; i <= n; i++) {
            a[i] = (a[i - 2].add(a[i - 1].multiply(a[i - 1])));
        }
        System.out.println(a[n]);

    }
}
