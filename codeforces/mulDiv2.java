import java.io.*;
import java.util.*;

public class mulDiv2 {
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
            long n = sc.nextLong();
            long count = 0;
            int flag = 1;
            while (n >= 6) {
                long rem = n % 6;
                if (rem == 0) {
                    n /= 6;
                    count++;
                } else if (rem == 2 || rem == 4 || rem == 5) {
                    // System.out.println("Yeh Chala");
                    flag = 1;
                    // out.println(-1);
                    break;
                    // n = 0;
                } else {
                    n *= 2;
                    count++;
                }
            }
            if (n == 1) {
                out.println(count);
            } else if (n == 3)
                out.println(count + 2);
            else if (n == 6)
                out.println(count + 1);
            else
                out.println(-1);

        }
        out.flush();
    }
}