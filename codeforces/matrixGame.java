import java.io.*;
import java.util.*;

public class Main {
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
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int init = m * n;
            int left = init;
            // System.out.println(init);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int temp = sc.nextInt();
                    if (temp == 1) {
                        if (!row.contains(i) && !col.contains(j)) {
                            left = left - (n + m - 1);
                            row.add(i);
                            col.add(j);
                            // System.out.println("Exec1");
                            // System.out.println(n+m-1);
                        } else if (row.contains(i) && !col.contains(j)) {
                            left = left - row.size();
                            col.add(j);
                            // System.out.println("exec2");
                            // System.out.println(n-1);
                        } else if (col.contains(j) && !row.contains(i)) {
                            left = left - col.size();
                            row.add(i);

                            // System.out.println("Exec3");
                            // System.out.println(m-1-col.size());
                        }
                    }
                }
            }
            // System.out.println(row);
            // System.out.println(col);
            int ans = Math.min(n - row.size(), m - col.size());
            if ((ans & 1) == 1)
                System.out.println("Ashish");
            else
                System.out.println("Vijay");
            row.clear();
            col.clear();

        }
    }
}