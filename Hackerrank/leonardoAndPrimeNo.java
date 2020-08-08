import java.io.*;
import java.util.*;

public class leonardoAndPrimeNo {
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

    static int[] primes = new int[10000001];
    static ArrayList<Integer> prime_no = new ArrayList<>();

    public static void calPrimes() {
        primes[0] = 1;
        primes[1] = 1;
        for (int i = 4; i <= 1000000; i += 2) {
            primes[i] = 1;
        }
        for (int i = 2; i * i <= 1000000; i++) {

            if (primes[i] == 0) {
                prime_no.add(i);
                for (int j = i * i; j <= 1000000; j += i) {
                    primes[j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        calPrimes();
        // for (int x : prime_no) {
        // System.out.print(x + " ");
        // }
        int t = sc.nextInt();
        while (t-- > 0) {
            long n;
            n = sc.nextLong();
            int count = 0;
            long res = 1;
            for (int i = 0; i <= 16; i++) {
                long curr = prime_no.get(i);
                // System.out.println(curr);
                res *= curr;
                if (res <= n && res > 0) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
        // out.flush();
    }
}