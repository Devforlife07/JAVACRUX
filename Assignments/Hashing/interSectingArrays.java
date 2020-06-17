import java.io.*;
import java.util.*;

/**
 * interSectingArrays
 */
public class interSectingArrays {
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

    static class Node {
        int count1;
        int count2;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        TreeMap<Integer, Node> map = new TreeMap<>();
        int i = 1;
        while (i <= n) {
            int t = sc.nextInt();
            if (map.containsKey(t)) {
                map.get(t).count1++;

            } else {
                Node temp = new Node();
                temp.count1 = 1;
                map.put(t, temp);
            }
            i++;
        }
        i = 1;
        while (i <= n) {
            int t = sc.nextInt();
            if (map.containsKey(t)) {
                map.get(t).count2++;

            }
            i++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Node> ent : map.entrySet()) {
            int e1 = ent.getValue().count1;
            int e2 = ent.getValue().count2;
            int e = Math.min(e1, e2);
            while (e > 0) {
                ans.add(ent.getKey());
                e--;
            }
        }
        System.out.println(ans);

    }

}