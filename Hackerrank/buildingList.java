import java.io.*;
import java.util.*;

public class buildingList {
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
            ArrayList<String> ans = new ArrayList<>(1000);
            int n = sc.nextInt();
            String str = sc.next();
            for (long i = 1; i < (1 << str.length()); i++) {
                String curr = "";
                int pos = 0;
                for (long j = i; j > 0; j >>= 1) {
                    if ((j & 1) == 1) {
                        curr = curr + str.charAt(pos);
                    }
                    pos++;

                }
                ans.add(curr);
            }
            Collections.sort(ans);
            for (String temp : ans) {
                out.println(temp);
            }

        }
        out.flush();

    }
}