import java.io.*;
import java.util.*;

public class productOfNumbers {
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

    static int getFactors(HashMap<Long, Integer> map, long n) {
        int count = 0;
        for (long i = 2; i * i <= n; i++) {
            int c = 0;
            while (n % i == 0) {
                c++;
                n /= i;
            }
            if (c > 0) {
                map.put(i, c);
                count++;
            }
        }
        if (n > 2) {
            map.put(n, 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashMap<Long, Integer> map = new HashMap<>();
            long n = sc.nextLong();
            int count = getFactors(map, n);

            if (count == 1) {
                int no = 0;
                long fac = 0;
                for (Map.Entry<Long, Integer> ent : map.entrySet()) {
                    no = ent.getValue();
                    fac = ent.getKey();
                }
                if (no < 6) {
                    out.println("NO");
                } else {
                    out.println("YES");
                    long a = fac;
                    long b = fac * fac;
                    long c = n / (a * b);
                    out.println(a + " " + b + " " + c);

                }
            } else if (count == 2) {
                long a = 1;
                long b = 1;
                int co = 0;
                for (Map.Entry<Long, Integer> ent : map.entrySet()) {
                    if (co == 0) {
                        a = ent.getKey();
                        co++;
                    } else {
                        b = ent.getKey();
                    }
                }
                long c = n / (a * b);
                if (c != a && c != b && c != 1) {
                    out.println("YES");
                    out.println(a + " " + b + " " + c);
                } else {
                    out.println("NO");
                }
            } else if (count >= 3) {
                out.println("YES");
                long a = 1;
                long b = 1;
                int co = 0;
                for (Map.Entry<Long, Integer> ent : map.entrySet()) {
                    if (co == 0) {
                        a = ent.getKey();
                        co++;
                    } else {
                        b = ent.getKey();
                    }
                }
                long c = n / (a * b);
                out.println(a + " " + b + " " + c);

            } else
                out.println("NO");
        }
        out.flush();

    }
}