import java.io.*;
import java.util.*;

public class almostPrime {
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

    static ArrayList<Integer> primes = new ArrayList<>();
    static int[] b = new int[3005];

    public static void calPrimes() {
        Arrays.fill(b, 1);
        b[0] = b[1] = 0;
        for (int i = 2; i <= 3000; i++) {

            if (b[i] == 1) {
                primes.add(i);
                for (int j = i * i; j <= 3000; j += i) {
                    b[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n;
        n = sc.nextInt();
        calPrimes();
        // for (auto x : primes)
        // cout << x << ' ';
        int count = 0;
        for (int i = 2; i <= n; i++) {
            int c = 0;
            for (int x : primes) {
                if (i % x == 0)
                    c++;
            }
            if (c == 2)
                count++;
        }
        out.println(count);
        out.flush();

    }
}