import java.io.*;
import java.util.*;

/**
 * honestCoach
 */
public class honestCoach {
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
            Set<Integer> val = new HashSet<>();
            int n = sc.nextInt();
            int[] a = new int[n];
            int i = 0;
            int flag = 0;
            while (i < n) {
                int temp = sc.nextInt();
                if (val.contains(temp)) {
                    flag = 1;
                    // System.out.println(0);

                } else {
                    val.add(temp);
                    a[i] = temp;
                }

                i++;
            }
            if (flag == 0) {
                int min = Integer.MAX_VALUE;
                Arrays.sort(a);
                for (i = 1; i < n; i++) {
                    if (a[i] - a[i - 1] < min) {
                        min = a[i] - a[i - 1];
                    }
                }
                System.out.println(min);
            } else
                System.out.println(0);
            // val.clear();

            t--;
        }

    }

}