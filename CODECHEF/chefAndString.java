import java.io.*;
import java.util.*;

/**
 * chefAndString
 */
public class chefAndString {
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
            // int n = sc.nextInt();
            String str = sc.next();
            int ans = 0;
            int i = 0;
            while (i < str.length() - 1) {
                if ((str.charAt(i) == 'x' && str.charAt(i + 1) == 'y')
                        || str.charAt(i) == 'y' && str.charAt(i + 1) == 'x') {
                    ans++;
                    i += 2;
                } else
                    i++;

            }

            out.println(ans);
            out.flush();

        }
    }

}