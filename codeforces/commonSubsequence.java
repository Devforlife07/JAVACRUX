import java.io.*;
import java.util.*;

public class commonSubsequence {
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
            HashSet<Integer> set = new HashSet<>();
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int i = 0;
            int ans = 0;
            int x = 0;
            while (i < n) {
                set.add(sc.nextInt());
                i++;
            }
            int flag = 0;
            i = 0;
            int temp;
            while (i < m) {
                temp = sc.nextInt();
                if (set.contains(temp) && x == 0) {
                    flag = 1;
                    x = 1;
                    ans = temp;
                    // break;
                }
                i++;
            }
            if (flag == 1) {
                out.println("YES");
                out.println(1 + " " + ans);
            } else
                out.println("NO");
        }
        out.close();
    }
}