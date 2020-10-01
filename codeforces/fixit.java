import java.io.*;
import java.util.*;

public class fixit {
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
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            char ch[][] = new char[1000][1000];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    ch[i] = sc.next().toCharArray();
                }
            }
            int count = 0;
            for (int i = 1; i < m; i++) {
                if (ch[1][i] == 'D')
                    count++;
            }
            for (int i = 1; i < n; i++) {
                if (ch[i][m] == 'R') {
                    count++;
                }
            }
            out.println(count);
        }
        out.close();
    }
}