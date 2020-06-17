import java.io.*;
import java.util.*;

public class rotationMatching {
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
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        int[] pos = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            pos[a[i]] = i;
        }
        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
            map.put(i, 0);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int curr = pos[b[i]] - i;
            if (curr < 0) {
                curr += n;
            }
            map.put(curr, map.get(curr) + 1);
        }
        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            max = Math.max(max, ent.getValue());
        }
        System.out.println(max);

    }
}