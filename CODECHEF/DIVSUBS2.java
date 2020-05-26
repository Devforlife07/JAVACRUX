import java.util.*;
import java.io.*;

class DIVSUBS2 {
    // static Scanner sc = new Scanner(System.in);

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
            HashMap<Long, List<Integer>> map = new HashMap<>();
            map.put(0l, new ArrayList<Integer>());
            map.get(0l).add(0);
            for (int i = 1; i < n; i++) {
                map.put((long) i, new ArrayList<Integer>());
            }
            int i = 0;
            long sum = 0;
            while (i < n) {
                int temp = sc.nextInt();
                sum += temp;
                map.get(sum % n).add((i + 1));
                i++;
            }
            // System.out.println(map);
            for (Map.Entry<Long, List<Integer>> temp : map.entrySet()) {
                if (temp.getValue().size() >= 2) {
                    System.out.println(temp.getValue().get(1) - temp.getValue().get(0));
                    int start = temp.getValue().get(0);
                    int end = temp.getValue().get(1);
                    for (int j = start + 1; j <= end; j++) {
                        System.out.print(j + " ");
                    }
                    break;

                }
            }
            t--;
        }
    }

}