import java.io.*;
import java.util.*;

public class troubleSort {
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
            int[] a = new int[n];
            int[] b = new int[n];
            int[] a1 = new int[n];
            int i = 0;
            while (i < n) {
                int temp = sc.nextInt();
                a[i] = temp;
                a1[i] = temp;
                i++;
            }
            i = 0;
            int odd = 0;
            int even = 0;
            while (i < n) {
                int temp = sc.nextInt();
                b[i] = temp;
                if ((temp & 1) == 1)
                    odd++;
                else
                    even++;
                i++;
            }
            int count = 0;
            Arrays.sort(a1);
            for (i = 0; i < n; i++) {
                if (a[i] != a1[i])
                    count++;
            }
            if (count == 0)
                System.out.println("Yes");
            else if (odd > 0 && even > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}