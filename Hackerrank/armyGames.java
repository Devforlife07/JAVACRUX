import java.io.*;
import java.util.*;

public class armyGames {
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
        int row = sc.nextInt();
        int col = sc.nextInt();
        long res = 0;
        if (col > row) {
            res = (long) Math.ceil((double) col / 2);
            res *= (long) Math.ceil((double) row / 2);

        } else if (col <= row) {
            res = (long) Math.ceil((double) col / 2);
            res *= (long) Math.ceil((double) row / 2);

        }
        out.println(res);
        out.flush();

    }
}