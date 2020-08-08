import java.io.*;
import java.util.*;

public class chefAndCardGame {
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

    public static long sum(long a) {
        long sum = 0;
        while (a > 0) {
            int curr = a % 10;
            sum += curr;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = 0, b = 0;
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                long a1 = sum(sc.nextLong());
                long a2 = sum(sc.nextLong());
                if (a1 > a2)
                    a++;
                else
                    b++;
            }
            if (a > b)
                out.println(0 + " " + a);
            else if (b > a)
                out.println(1 + " " + b);
            else
                out.println(2 + " " + a);
        }
    }
}