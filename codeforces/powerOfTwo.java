import java.io.*;
import java.util.*;

public class powerOfTwo {
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
        long n = sc.nextLong();
        long k = sc.nextLong();
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 30; i++) {
            if ((n & (1 << i)) >= 1) {
                // System.out.println(i);
                if (i > 0) {
                    q.add((1 << i));
                }

                if (map.containsKey((1 << i)))
                    map.put((1 << i), map.get(1 << i) + 1);
                else
                    map.put((1 << i), 1);
            }
        }
        if (k < map.size()) {
            out.println("NO");
            out.flush();
            return;
        }

        int curr = map.size();
        while (curr < k && (!q.isEmpty())) {
            int temp = q.poll();
            map.put(temp, map.get(temp) - 1);
            temp = temp / 2;
            if (!map.containsKey(temp)) {
                map.put(temp, 2);
            } else
                map.put(temp, map.get(temp) + 2);
            if (temp > 1) {
                q.offer(temp);
                q.offer(temp);
            }
            curr++;
        }
        if (curr < k) {
            out.println("NO");
        } else {
            out.println("YES");
            // out.println(map.entrySet());
            for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
                for (int i = 1; i <= ent.getValue(); i++) {
                    out.print(ent.getKey() + " ");
                }
            }
        }
        out.flush();

    }
}