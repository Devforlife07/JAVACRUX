import java.io.*;
import java.util.*;

public class similarpair {
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
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            HashMap<String, List<Integer>> map = new HashMap<>();
            map.put("odd", new ArrayList<Integer>());
            map.put("even", new ArrayList<Integer>());
            int i = 0;
            while (i < n) {
                int temp = sc.nextInt();
                a[i] = temp;
                if ((temp & 1) == 1) {
                    map.get("odd").add(temp);
                } else
                    map.get("even").add(temp);
                i++;
            }
            Arrays.sort(a);
            int c = 0;
            int flag = 0;
            for (i = 1; i < a.length; i++) {
                if (a[i] - a[i - 1] == 1) {
                    flag = 1;
                    c = 1;
                    // break;
                }
            }
            if ((map.get("odd").size() % 2 == 0) && (map.get("even").size() % 2 == 0)) {
                System.out.println("YES");
            } else {
                if (flag == 0) {
                    System.out.println("NO");
                } else {
                    if ((map.get("odd").size() - c) % 2 == 0 && (map.get("even").size() - c) % 2 == 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
            t--;
        }
    }
}