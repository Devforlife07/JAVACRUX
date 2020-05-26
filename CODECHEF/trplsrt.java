import java.util.*;
import java.io.*;

class trplsrt {
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

    static int odd_count = 0;
    static int even_count = 0;

    public static void getResult(int[] a, int n, HashMap<String, List<List<Integer>>> map) {
        int vis = 0;
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == a[i])
                visited[i] = true;
            else {
                visited[i] = false;
                vis++;
            }
        }
        int i = 1;
        int c = 0;
        for (i = 1; i <= n && c <= vis; i++) {
            if (visited[i] == true) {
                continue;
            } else {
                vis++;
                visited[i] = true;
                ArrayList<Integer> cyc = new ArrayList<>();
                cyc.add(a[i]);
                int next = a[i];
                while (visited[next] != true) {
                    cyc.add(a[next]);
                    visited[next] = true;
                    next = a[next];
                }
                if (((cyc.size()) & 1) == 1) {
                    odd_count++;
                    map.get("odd").add(cyc);
                } else {
                    even_count++;
                    map.get("even").add(cyc);
                }

            }
        }

    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        List<Integer> ans = new ArrayList<>();
        int ans_count = 0;
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n + 1];
            int i = 1;
            while (i <= n) {
                a[i] = sc.nextInt();
                i++;
            }
            HashMap<String, List<List<Integer>>> map = new HashMap<>();
            map.put("odd", new ArrayList<>());
            map.put("even", new ArrayList<>());
            getResult(a, n, map);
            System.out.println(map);
            if ((map.get("even").size() & 1) == 1) {
                System.out.println(-1);
            } else {
                // FOR Odd Cycles
                for (List<Integer> temp : map.get("odd")) {
                    int first_value = temp.get(0);
                    int c = 1;
                    for (int j = 1; j <= temp.size(); j += 1) {

                        if (c == 3) {
                            ans.add(first_value);
                            ans.add(temp.get(j - 2));
                            ans.add(temp.get(j - 1));
                            c = 2;
                            ans_count++;
                        } else
                            c++;
                    }

                }
                // For Even Cycles
                ArrayList<Integer> even = new ArrayList<>();
                for (List<Integer> temp : map.get("even")) {
                    for (int x : temp)
                        even.add(x);
                }
                int first_value = even.get(0);
                for (int j = 1; j <= even.size(); j++) {

                }
            }
            System.out.println(ans);
            t--;
        }

    }
}
