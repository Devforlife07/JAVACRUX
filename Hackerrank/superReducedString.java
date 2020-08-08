import java.io.*;
import java.util.*;

public class superReducedString {
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
        HashMap<Character, Integer> map = new HashMap<>();
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (map.containsKey(cc)) {
                map.put(cc, map.get(cc) + 1);

            } else {
                map.put(cc, 1);
            }
        }
        int flag = 0;
        for (Map.Entry<Character, Integer> ent : map.entrySet()) {
            int val = ent.getValue();
            if (val % 2 != 0) {
                flag = 1;
                out.print(ent.getKey());
            }
        }
        if (flag == 0)
            out.print("Empty String");
        out.flush();
    }
}