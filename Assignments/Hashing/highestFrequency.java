import java.util.*;
import java.io.*;

public class highestFrequency {
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
        int n = sc.nextInt();
        int i = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (i <= n) {
            int t = sc.nextInt();
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);

            }
            i++;
        }
        int max = 0;
        int count = Integer.MIN_VALUE;
        // System.out.println(map);
        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            if (ent.getValue() > count) {
                count = ent.getValue();
                max = ent.getKey();
            }
        }
        System.out.println(max);
    }
}