import java.io.*;
import java.util.*;

public class mariaBreaks {
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
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            // TreeMap<Integer, Integer> map = new TreeMap<>();
            int i = 1;
            while (i <= n) {
                a[i] = sc.nextInt();
                i++;
            }
            Arrays.sort(a);
            int ans = 1;
            for (i = n; i > 0; i--) {
                if (a[i] <= i) {
                    ans += i;
                    break;
                }

            }
            System.out.println(ans);

        }

    }

}