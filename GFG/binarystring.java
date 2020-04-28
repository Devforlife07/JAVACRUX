import java.util.*;
import java.io.*;

public class binarystring {
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

    static Scanner sc = new Scanner(System.in);

    public static void getResult(ArrayList<Character> ll, int n, int i) {
        if (ll.size() == n) {

            System.out.println(1);
            return;
        }
        ll.add('0');
        getResult(ll, n, i + 1);
        ll.set(i, '1');
        getResult(ll, n, i + 1);

    }

    static FastReader ff = new FastReader();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = sc.nextInt();
        // int n = ff.nextInt();
        getResult(new ArrayList<Character>(), n, 0);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}