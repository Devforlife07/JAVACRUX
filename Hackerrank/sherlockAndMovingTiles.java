import java.io.*;
import java.util.*;

public class sherlockAndMovingTiles {
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
        long l = sc.nextLong();
        long s1 = sc.nextLong();
        long s2 = sc.nextLong();
        long s = (long) Math.abs(s1 - s2);
        int t = sc.nextInt();
        while (t-- > 0) {
            long q = sc.nextLong();
            double res = (1.414 * ((l - Math.sqrt(q)) / s));
            System.out.printf("%.5f\n", res);
        }
    }
}