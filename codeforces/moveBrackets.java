import java.io.*;
import java.util.*;

public class moveBrackets {
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
            int n = sc.nextInt();
            String str = sc.nextLine();
            int bal = 0;
            int ans = 0;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char cc = str.charAt(i);
                if (cc == '(') {
                    bal++;
                } else {
                    bal--;
                }
                count++;
                if (bal == 0 && i != 1) {
                    if (i == str.length() - 1) {
                        count = 0;
                    }
                    ans += count;
                }

            }
            out.println(ans);

        }
        out.flush();
    }
}