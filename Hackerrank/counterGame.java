
import java.util.*;
import java.io.*;

public class counterGame {
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
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long temp = n;
            int c = 0;
            while (temp != 1) {
                c++;
                if (n != 1 && Long.bitCount(temp) == 1) {
                    temp /= 2;

                } else {
                    temp = temp - (long) Math.pow(2, Math.floor(Math.log(temp) / Math.log(2)));
                    // System.out.println(temp);
                }

            }
            if ((c & 1) == 1)
                System.out.println("Louise");
            else
                System.out.println("Richard");
            t--;
        }

    }
}
