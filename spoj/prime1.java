import java.io.*;
import java.util.*;

public class prime1 {
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

    static int[] primes = new int[100005];
    static ArrayList<Integer> prime_nos = new ArrayList<>(100000);

    public static void fillPrimes() {
        Arrays.fill(primes, 1);
        primes[0] = 0;
        primes[1] = 0;
        for (int i = 2; i <= 100000; i++) {
            if (primes[i] == 1) {
                prime_nos.add(i);
                for (long j = i; j <= 100000; j += i) {

                    primes[(int) j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        fillPrimes();
        int t = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>(100000);
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int a[] = new int[n - m + 1];
            Arrays.fill(a, 1);
            for (int x : prime_nos) {
                if (x * x > n)
                    break;

                int start = (m / x) * x;
                if (x >= m && x <= n)
                    start = x * 2;

                if (start < m)
                    start += x;
                for (int i = start; i <= n; i += x) {
                    // if (start < m)
                    // continue;

                    a[i - m] = 0;
                }
            }
            for (int i = m; i <= n; i++) {
                if (a[i - m] == 1 && i != 1)
                    out.println(i);
            }
        }
        out.flush();

    }
}