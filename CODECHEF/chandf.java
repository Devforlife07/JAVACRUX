
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
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

    public static void getAns(long x, long y, long l, long r) {
        // System.out.println("Yahi Se Chala Hai");
        long max = 0;
        long o = (x | y);
        long pos = 0;
        while (o > 0) {
            pos++;
            o >>= 1;
        }
        long mask = ~(1 << (pos - 1));
        o = x | y;
        long i = 0;
        while (i < pos) {
            long curr = (o & mask);

            if (curr <= r) {
                System.out.println(curr);
                return;
            }
            i++;
            o = curr;
            mask = mask >> 1;
        }
        System.out.println(0);

    }

    public static void main(String[] args) throws java.lang.Exception {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t > 0) {

            long x = sc.nextLong();
            long y = sc.nextLong();
            long l = sc.nextLong();
            long r = sc.nextLong();
            if (x != 0 && y != 0) {
                long p = x | y;
                if (p <= r) {
                    System.out.println(p);
                } else {
                    getAns(x, y, l, r);

                }
            } else
                System.out.println(0);

            t--;

        }
    }
}
