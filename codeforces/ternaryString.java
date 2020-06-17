import java.util.*;
import java.io.*;

public class ternaryString {
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
        HashMap<Character, Integer> map = new HashMap<>();
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t > 0) {
            int min = Integer.MAX_VALUE;
            String S = sc.nextLine();
            for (int i = 0; i < S.length(); i++) {
                char cc = S.charAt(i);
                map.put(cc, i);
                if (map.size() == 3) {
                    int t_min = Integer.MAX_VALUE;
                    int t_max = Integer.MIN_VALUE;
                    int curr_min = 0;
                    for (Map.Entry<Character, Integer> ent : map.entrySet()) {
                        if (t_min > ent.getValue()) {
                            t_min = ent.getValue();
                        }
                        if (t_max < ent.getValue()) {
                            t_max = ent.getValue();
                        }
                    }
                    curr_min = t_max - t_min + 1;
                    if (curr_min < min) {
                        min = curr_min;
                    }
                }

            }
            // System.out.println(map);
            if (min != Integer.MAX_VALUE)
                System.out.println(min);
            else
                System.out.println(0);
            map.clear();

            t--;
        }
    }

}